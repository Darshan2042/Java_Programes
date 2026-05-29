package OOP.Practice;
import java.util.ArrayList;
import java.util.Scanner;

abstract class FoodItem{
    private int itemId;
    private String itemName;
    private double price;
    
    FoodItem(int itemId , String itemName , double price){
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    int getId(){
        return itemId;
    }

    String getName(){
        return itemName;
    }

    double getprice(){
        return price;
    }

    void setItemId(int itemId){
        this.itemId = itemId;
    }

    void setItemName(String itemName){
        this.itemName = itemName;
    }

    void setPrice(double price){
        this.price = price;
    }

    abstract double calculatePrice();

    void displayItem(){
        System.out.println(itemId);
        System.out.println(itemName);
        System.out.println(price);
    }
}

class VegItem extends FoodItem{
    private int discountPercent;

    VegItem(int itemId, String itemName, double price, int discountPercent){
        super(itemId,itemName,price);
        this.discountPercent = discountPercent;
    }

    @Override
    double calculatePrice(){
        double discount = (getprice() * discountPercent) / 100;
        return getprice() - discount;
    }
}

class NonVegItem extends FoodItem{
    private int extraCharge;

    NonVegItem(int itemId, String itemName, double price, int extraCharge){
        super(itemId , itemName , price);
        this.extraCharge = extraCharge;
    }

    @Override
    double calculatePrice(){
        return getprice() + extraCharge;
    }
}

class Order{
    ArrayList<FoodItem> items;

    Order(){
        items = new ArrayList<>();
    }

    void addItem(FoodItem item){
        items.add(item);
    }

    double calculateTotalBill(){
        double total = 0;

        for(FoodItem item : items){
            total += item.calculatePrice();
        }

        return total;
    }

    void display(){
        for(FoodItem item : items){
            item.displayItem();
            System.out.println("--------------------");
        }

        System.out.println("Total Bill: " + calculateTotalBill());
        System.out.println("--------------------");
    }
}

public class FoodDeliveryApp {

    public static void main(String args[]){

        Order order = new Order();
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("--------------------");
            System.out.println("1.Add Veg");
            System.out.println("2.Add NonVeg");
            System.out.println("3.Display Order");
            System.out.println("4.Exit");
            System.out.println("--------------------");

            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();

            switch(choice){

                case 1:

                    System.out.println("Enter Veg Item Details");

                    System.out.print("ID : ");
                    int vid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name : ");
                    String vname = sc.nextLine();

                    System.out.print("Price : ");
                    double vprice = sc.nextDouble();

                    System.out.print("Discount % : ");
                    int discount = sc.nextInt();

                    VegItem veg =
                            new VegItem(vid, vname, vprice, discount);

                    order.addItem(veg);

                    System.out.println("Veg Item Added");
                    System.out.println("--------------------");
                    break;

                case 2:

                    System.out.println("Enter NonVeg Item Details");

                    System.out.print("ID : ");
                    int nid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name : ");
                    String nname = sc.nextLine();

                    System.out.print("Price : ");
                    double nprice = sc.nextDouble();

                    System.out.print("Extra Charge : ");
                    int extraCharge = sc.nextInt();

                    NonVegItem nonVeg =
                            new NonVegItem(nid, nname, nprice, extraCharge);

                    order.addItem(nonVeg);

                    System.out.println("NonVeg Item Added");
                    System.out.println("--------------------");
                    break;

                case 3:

                    order.display();
                    System.out.println("--------------------");
                    break;

                case 4:

                    System.out.println("Application Closed");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
                    System.out.println("--------------------");
            }
        }
    }
}