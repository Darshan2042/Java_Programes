package OOP.ExceptionHandling;

public class ClassNotFoundExample {
    public static void main(String[] args) {
        System.out.println("Program Started...");
        try {
            Class.forName("a.b.sample");
        }
        catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException Occurred");
            System.out.println(e);
        }
        System.out.print("Program Ended...");
    }
}