import java.util.Arrays;
import java.util.Stack;
public class PreviouseSmallerElement {
    public int[] pge(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0 ; i<arr.length; i++){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
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
        PreviouseSmallerElement ng = new PreviouseSmallerElement();
        int[] arr = {45,65,8,45,52,45,21,12,15};
        int[] result  = ng.pge(arr);
        System.out.println(Arrays.toString(result));
    }
}
