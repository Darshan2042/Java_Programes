import java.util.Stack;
import java.util.Arrays;
public class NextGreaterElement {
    public int[] nge(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1 ; i>=0 ; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
    public static void main(String args[]){
        NextGreaterElement ng = new NextGreaterElement();
        int[] arr = {45,65,8,45,52,45,21,12,15};
        int[] result  = ng.nge(arr);
        System.out.println(Arrays.toString(result));
    }
}
