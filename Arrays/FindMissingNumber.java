package Arrays;
import java.util.Arrays;
public class FindMissingNumber {
    public int missingnum(int[] nums){
        int xor = 0;
        for(int i=1; i<=nums.length+1 ; i++){
            xor ^= i;
        }
        for(int num : nums){
            xor ^= num;
        }
        return xor;
    }

    public int normal(int[] nums){
        int n = nums.length+1;
        int expected = n*(n+1)/2;
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        return expected-sum;
    }

    public int usingsort(int[] nums){
        Arrays.sort(nums);
        int fast = nums[0];
        fast = fast*(fast+1)/2;
        int last = nums[nums.length-1];
        last = last*(last+1)/2;
        last -= fast;
        for(int i=1 ; i<nums.length ; i++){
            last -= nums[i];
        }
        return last;
    }
    public static void main(String args[]){
        FindMissingNumber f = new FindMissingNumber();
        int[] arr = {1,3,2,5,6};
        System.out.println(f.missingnum(arr));
        System.out.println(f.normal(arr));
        System.out.println(f.usingsort(arr));
    }
    
}
