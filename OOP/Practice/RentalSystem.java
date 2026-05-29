package OOP.Practice;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Vehicle {
    private String vehicleNumber;
    private String brand;
    private double rentPerDay;
    private boolean isAvailable;
    Vehicle(String vehicleNumber, String brand, double rentPerDay, boolean isAvailable) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
        this.isAvailable = isAvailable;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public String getBrand() {
        return brand;
    }
    public double getRentPerDay() {
        return rentPerDay;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setRentPerDay(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    abstract double calculateRent(int days);
    void displayDetails() {
        System.out.println("VehicleNumber: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("rentPerDay: " + rentPerDay);
        System.out.println("isAvailable: " + isAvailable);
    }
}

class Car extends Vehicle {
    private String fuelType;
    Car(String vehicleNumber, String brand,
        double rentPerDay, boolean isAvailable,
        String fuelType) {
        super(vehicleNumber, brand, rentPerDay, isAvailable);
        this.fuelType = fuelType;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    @Override
    public double calculateRent(int days) {
        double rent = getRentPerDay() * days;
        if (days > 5) {
            rent = rent - (rent * 0.10);
        }
        return rent;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("fuelType: " + fuelType);
    }
}

class Bike extends Vehicle {
    private boolean helmetIncluded;
    Bike(String vehicleNumber, String brand,
        double rentPerDay, boolean isAvailable,
        boolean helmetIncluded) {
        super(vehicleNumber, brand, rentPerDay, isAvailable);
        this.helmetIncluded = helmetIncluded;
    }
    public boolean isHelmetIncluded() {
        return helmetIncluded;
    }
    public void setHelmetIncluded(boolean helmetIncluded) {
        this.helmetIncluded = helmetIncluded;
    }

    @Override
    public double calculateRent(int days) {
        double rent = getRentPerDay() * days;
        if (isHelmetIncluded()) {
            rent += 50;
        }
        return rent;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("helmetIncluded: " + helmetIncluded);
    }
}

public class RentalSystem {
    public static void main(String args[]) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1 Add Car");
            System.out.println("2 Add Bike");
            System.out.println("3 Display All");
            System.out.println("4 Calculate Rent");
            System.out.println("5 Exit");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                    case 1:
                        System.out.print("Enter Vehicle Number:");
                        String vehicleNumberCar = sc.nextLine();
                        System.out.print("Enter Brand:");
                        String brandCar = sc.nextLine();
                        System.out.print("Enter Rent Per Day:");
                        double rentCar = sc.nextDouble();
                        System.out.print("Is Available (true/false):");
                        boolean isAvailableCar = sc.nextBoolean();
                        sc.nextLine();
                        System.out.print("Enter Fuel Type:");
                        String fuelTypeCar = sc.nextLine();
                        Car c = new Car(vehicleNumberCar, brandCar, rentCar, isAvailableCar, fuelTypeCar);
                        vehicles.add(c);
                        System.out.println("____________________");
                        break;

                    case 2:
                        System.out.print("Enter Vehicle Number:");
                        String vehicleNumberBike = sc.nextLine();
                        System.out.print("Enter Brand:");
                        String brandBike = sc.nextLine();
                        System.out.print("Enter Rent Per Day:");
                        double rentBike = sc.nextDouble();
                        System.out.print("Is Available (true/false):");
                        boolean isAvailableBike = sc.nextBoolean();
                        System.out.print("Helmet Included (true/false):");
                        boolean helmetIncludedBike = sc.nextBoolean();
                        sc.nextLine();
                        Bike b = new Bike(vehicleNumberBike, brandBike, rentBike, isAvailableBike, helmetIncludedBike);
                        vehicles.add(b);
                        System.out.println("____________________");
                        break;

                    case 3:
                        for (Vehicle v : vehicles) {
                            v.displayDetails();
                        }
                        System.out.println("____________________");
                        break;

                    case 4:
                        System.out.print("Enter Vehicle Number:");
                        String vehicleNumber = sc.nextLine();
                        System.out.print("Enter Rental Days:");
                        int days = sc.nextInt();
                        boolean found = false;
                        for (Vehicle v : vehicles) {
                            if (v.getVehicleNumber().equals(vehicleNumber)) {
                                double rent = v.calculateRent(days);
                                System.out.println("Total Rent: " + rent);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Vehicle Not Found");
                        }
                        System.out.println("____________________");
                        break;

                    case 5:
                        System.out.println("Exiting.....");
                        return;
                }
        }
    }
}