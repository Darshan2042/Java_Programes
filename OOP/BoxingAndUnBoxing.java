package OOP;

public class BoxingAndUnBoxing {
    public static void main(String args[]) {

        Integer aobj = 10;
        int a = aobj;

        System.out.println("After Unboxing and adding 15: " + (a + 15));
        System.out.println("Unboxed value: " + a);

        int b = 10;
        Integer bobj = b;

        System.out.println("After Autoboxing and adding 15: " + (bobj + 15));
        System.out.println("Autoboxed value: " + bobj);
    }
}