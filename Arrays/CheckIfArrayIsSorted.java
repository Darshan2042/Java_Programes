package Arrays;
import java.util.Arrays;
public class CheckIfArrayIsSorted {
    public boolean isvalid(int[] nums){
        for(int i=0 ; i<nums.length-1 ; i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public boolean usingrecursion(int[] nums,int index){
        if(index == nums.length-1){
            return true;
        }
        if(nums[index] > nums[index+1]){
            return false;
        }
        return usingrecursion(nums, index+1);
    }

    public boolean usingInBuild(int[] nums){
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        return Arrays.equals(nums, arr);
    }
    public static void main(String args[]){
        CheckIfArrayIsSorted check = new CheckIfArrayIsSorted();
        int[] num = {10,20,30,40,50,60,70};
        System.out.println(check.isvalid(num));
        System.out.println(check.usingrecursion(num, 0));
        System.out.println(check.usingInBuild(num));
    }
}
