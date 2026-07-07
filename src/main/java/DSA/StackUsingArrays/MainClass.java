package DSA.StackUsingArrays;

import java.util.Stack;

public class MainClass {
    public static void main(String args[]){
        MyStack stack = new MyStack();
        System.out.println("Is Stack Empty? : " + stack.isEmpty());
        stack.push(50);
        stack.push("Darshan");
        stack.push(true);
        stack.push(3.14);
        System.out.println("Stack after pushing 4 elements: " + stack);
        stack.push("Rahul");
        System.out.println("Stack after pushing Rahul: " + stack);
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Is Stack Empty? : " + stack.isEmpty());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Position of true from top: " + stack.search(true));
    }

}
