package Arrays;
public class MaximumSumArray{
    public int Kadanes(int[] nums){
        int curr = nums[0];
        int max = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            curr = Math.max(nums[i],nums[i]+curr);
            max = Math.max(curr,max);
        }
        return max;
    }
    public static void main(String args[]){
        MaximumSumArray sm = new MaximumSumArray();
        int[] arr = {10,20,30,5050,60,50,506,60};
        System.out.println(sm.Kadanes(arr));
    }

}