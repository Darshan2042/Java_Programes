package OOP.ExceptionHandling.SchoolExample;

public class InvalidPasswordException extends RuntimeException {
    private String msg = "Invalid Password.!";
    InvalidPasswordException(){}
    InvalidPasswordException(String msg){
        this.msg = msg;
    }
    public String toString(){
        return getClass().getName()+":"+msg;
    } 
}
