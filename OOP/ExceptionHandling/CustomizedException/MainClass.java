package OOP.ExceptionHandling.CustomizedException;

public class MainClass {
    public static void main(String args[]){
        System.out.println("Program Started..");
        Site s = new Site();
        try{
            s.checkAge(12);
        }catch(InvalidAgeException e){
            System.out.println(e);
        }
        System.out.println("Program Ended..");
    }

}
