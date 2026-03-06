package Interview;

import java.util.HashMap;
import java.util.Stack;

public class balanced_parenthesis {
    public static void main(String[]args){
        String Str = "{[()]}}";

        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (char ch : Str.toCharArray()){
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }
            else{
                if (stack.isEmpty() || stack.peek() != map.get(ch)){
                    System.out.println("is not balanced_parenthesis");
                    return;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            System.out.println("is balanced_parenthesis");
        }
        else{
            System.out.println("is not balanced_parenthesis");
        }
    }
}
