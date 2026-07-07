package OOP.ExceptionHandling.CustomizedException;

public class Site {
    private void home(){
        System.out.println("Welcome Home");
    }
    public void checkAge(int age){
        System.out.println("User Age is: " + age);
        if(age >= 70){
            home();
        }
        else{
            // System.out.println("Sorry");
            throw new InvalidAgeException("Enter Valid Age:  ");
        }
    }
}
