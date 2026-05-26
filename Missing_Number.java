import java.util.*;
public class Missing_Number {
    public int usingMath(int[] nums){
        int n = nums.length+1;
        int expected_sum = n*(n+1)/2;
        int actual_sum = 0;
        for(int num : nums){
            actual_sum += num;
        }
        return expected_sum-actual_sum;
    }

    public int usingXOR(int[] nums){    // Important for the interview...
        int xor = 0;
        for(int i=1 ; i<=nums.length+1 ; i++){
            xor = xor ^ i;
        }
        for(int num : nums){
            xor = xor ^ num;
        }
        return xor;
    }

    public int usingSorting(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }
        return -1;
    }

    public int usingHashset(int[] nums){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0 ; i< nums.length ;i++){
            hs.add(nums[i]);
        }
        for(int i=1 ; i<= nums.length+1 ; i++){
            if(!hs.contains(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Missing_Number mn = new Missing_Number();
        int[] nums = {1,3,2,4,6};
        System.out.println(mn.usingMath(nums));
        System.out.println(mn.usingXOR(nums));
        System.out.println(mn.usingSorting(nums));
        System.out.println(mn.usingHashset(nums));
    }
}