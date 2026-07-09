import java.util.Stack;
public class ImplementQueueusingStack {
    public Stack<Integer> input = null;
    public Stack<Integer> output = null;
    public ImplementQueueusingStack(){
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int obj){
        input.push(obj);
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException();
        }

        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException();
        }

        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }



    public boolean isEmpty(){
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String args[]){
        ImplementQueueusingStack user1  = new ImplementQueueusingStack();
        user1.push(10);
        user1.push(20);
        user1.push(30);
        System.out.println("Front : " + user1.peek());
        System.out.println("pop element : " + user1.pop());
        System.out.println("Front : " + user1.peek());
        System.out.println("Empty or Not : " + user1.isEmpty());
        

    }

}
