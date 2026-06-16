package OOP.ExceptionHandling.CustomizedException;

public class InvalidAgeException extends RuntimeException {
    private String msg = "Invalid Age";
    InvalidAgeException(){}
    InvalidAgeException(String msg){this.msg = msg;}

    public String toString(){
        return getClass().getName()+":"+msg;

    }

    
}
