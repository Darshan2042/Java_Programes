package OOP.ExceptionHandling.SchoolExample;

public class InvalidEmailException extends RuntimeException {
    private String msg = "Invalid Email.!";
    InvalidEmailException(){}
    InvalidEmailException(String msg){
        this.msg = msg;
    }
    public String toString(){
        return getClass().getName()+":"+msg;
    }    
}

