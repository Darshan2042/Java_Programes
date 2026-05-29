package Arrays;
import java.util.Arrays;
import java.util.Stack;

public class MoveZerosToEnd {
    public void usingpointer(int[] nums){
        int j=0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    public int[] usingStack(int[] nums){
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for(int num : nums){
            if(num !=0){
                st.push(num);
            }else{
                count++;
            }
        }
        for(int i=0 ; i<count ; i++){
            st.push(0);
        }
        int[] res = new int[nums.length];
        for(int i=0 ; i<st.size() ; i++){
            res[i] = st.get(i);
        }
        return res;
    }
    public static void main(String args[]){
        MoveZerosToEnd m = new MoveZerosToEnd();
        int[] arr = {0,1,5,0,2,0,0,1,0,5};
        m.usingpointer(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(m.usingStack(arr)));
    }
    
}
