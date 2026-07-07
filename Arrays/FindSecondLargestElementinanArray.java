package Arrays;
import java.util.Arrays;

public class FindSecondLargestElementinanArray {
    public int seclar(int[] nums){
        int first = nums[0];
        int second  = Integer.MIN_VALUE;
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i] > first){
                second = first;
                second = nums[i];
            }
            else if(nums[i] > second && nums[i] != first){
                second = nums[i];
            }
        }
        return second;
    }

    public int usingsorting(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length-2];
    }
    public static void main(String args[]){
        FindSecondLargestElementinanArray sec = new FindSecondLargestElementinanArray();
        int[] nums = {85,66,25,75,85,25,21,52,5,352,25,25,252,5};
        System.out.println(sec.seclar(nums));
        System.out.println(sec.usingsorting(nums));
    }
}
