package OOP.ExceptionHandling;

abstract class Demo {
}

public class InstantiationIllegalAccessExample {
    public static void main(String[] args) {

        System.out.println("Program Started...");

        try {
            Class<?> c = Class.forName("OOP.ExceptionHandling.Demo");
            Object obj = c.newInstance();
        }
        catch (ClassNotFoundException |
               InstantiationException |
               IllegalAccessException e) {

            System.out.println("InstantiationException Occurred");
            System.out.println(e);
        }

        System.out.println("Program Ended...");
    }
}