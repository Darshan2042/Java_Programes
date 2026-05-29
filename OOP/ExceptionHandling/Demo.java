package OOP.ExceptionHandling;
public class Demo {
    public static void main(String args[]){
        System.out.println("Program Started..");
        int a = 10;
        int b = 2;
        int c = 0;
        try{
            c = a/b;
        }catch(ArithmeticException e){
            System.out.println("Number Not Divided by Zero...");
        }finally{
            System.out.println("Hello Sir this is Finally Block");
        }
        System.out.println(c);
        System.out.println("Program Ended....");
    }
}
