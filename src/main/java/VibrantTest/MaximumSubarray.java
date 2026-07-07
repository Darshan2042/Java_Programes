package VibrantTest;

public class MaximumSubarray {
	public int Kadane(int[] nums) {
		int curr = nums[0];
		int max = nums[0];
		for(int i =1 ; i<nums.length ; i++) {
			curr = Math.max(nums[i],curr + nums[i]);
			max = Math.max(curr, max);
		}
		return max;
	}

	public static void main(String[] args) {
		MaximumSubarray s = new MaximumSubarray();
		int[] nums = {20,30,50,40,60,20,30,40,50,60,40,60,10,0,50,80,50,60,40,20};
		System.out.println(s.Kadane(nums));

	}

}
