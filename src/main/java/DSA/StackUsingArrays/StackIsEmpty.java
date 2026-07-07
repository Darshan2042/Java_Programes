package DSA.StackUsingArrays;

public class StackIsEmpty extends  RuntimeException{
    private String msg = "Stack is empty, cannot pop elements";
    StackIsEmpty(){}
    StackIsEmpty(String msg){this.msg = msg;}
    public String toString(){
        return getClass().getName() + ": "+ msg;
    }
}
