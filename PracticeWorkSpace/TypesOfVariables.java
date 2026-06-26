package PracticeWorkSpace;
class Car {

    // Static variable (shared by all cars)
    static String company = "Tata";

    // Instance variables (different for each object)
    String model;
    int price;

    void showCarDetails() {

        // Local variable
        int tax = 50000;

        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println();
    }

    public static void main(String[] args) {

        // Car 1
        Car c1 = new Car();
        c1.model = "Nexon";
        c1.price = 1000000;

        // Car 2
        Car c2 = new Car();
        c2.model = "Harrier";
        c2.price = 1800000;

        c1.showCarDetails();
        c2.showCarDetails();
    }
}