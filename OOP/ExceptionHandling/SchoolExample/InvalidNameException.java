package OOP.ExceptionHandling.SchoolExample;

public class InvalidNameException extends RuntimeException {
    private String msg = "Invalid Name: !";
    InvalidNameException(){}
    InvalidNameException(String msg){
        this.msg = msg;
    }
    public String toString(){
        return getClass().getName()+":"+msg;
    } 
}
