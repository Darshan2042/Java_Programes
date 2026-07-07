package DSA.StackUsingArrays;

public class MyStack {
    private Object[] o = null;
    private int top = -1;
    public MyStack(){
        this(10);
    }
    public MyStack(int size){
        o = new Object[size];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    private boolean isFull(){
        return top == o.length-1;
    }

    public int size(){
        return top+1;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        if(!isEmpty()){
            for(int i=0 ; i<=top ; i++){
                sb.append(o[i]);
                sb.append(",");
            }
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("]");
        return sb.toString();
    }

    public void push(Object obj){
        if(isFull()){
            throw new StackIsFull();
        }
        o[++top] = obj;
    }

    public Object pop(){
        if(isEmpty()){
            throw new StackIsEmpty();
        }
        Object value = o[top];
        o[top] = null;
        top--;
        return value;
    }

    public Object peek(){
        if(isEmpty()){
            throw new StackIsEmpty();
        }
        return o[top];
    }

    public int search(Object obj){
        if(isEmpty()){
            throw new StackIsEmpty();
        }
        int pos = 1;
        for(int i=top ; i>=0 ; i--){
            if(o[i].equals(obj)){
                return pos;
            }
            pos++;
        }
        return -1;
    }
}
