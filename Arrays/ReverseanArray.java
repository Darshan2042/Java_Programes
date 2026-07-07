package Arrays;
import java.util.Arrays;
import java.util.Stack;

public class ReverseanArray {
    public int[] reverse(int[] num){
        int[] res = new int[num.length];
        for(int i=0; i<num.length ;i++){
            res[i] = num[num.length -1-i];
        }
        return res;
    }

    public void usingTwoPointer(int[] arr){
        int left=0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public void usingStack(int[] nums){
        Stack<Integer> st = new Stack<>();
        for(int num:nums){
            st.push(num);
        }
        for(int i=0 ; i<nums.length ; i++){
            nums[i] = st.pop();
        }
    }
    public static void main(String args[]){
        ReverseanArray ra = new ReverseanArray();
        int[] arr = {10,20,40,20,40};
        System.out.println(Arrays.toString(ra.reverse(arr)));
        // ra.usingTwoPointer(arr);
        // System.out.println(Arrays.toString(arr));
        ra.usingStack(arr);
        System.out.println(Arrays.toString(arr));
    }
}
