package DSA.StackUsingArrays;

public class StackIsFull extends RuntimeException{
    private String msg = "Stack is full, cannot push more elements";
    StackIsFull(){}
    StackIsFull(String msg){this.msg = msg;}
    public String toString(){
        return getClass().getName() + ": "+ msg;
    }
}
