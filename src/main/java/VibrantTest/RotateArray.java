package VibrantTest;

import java.util.Arrays;

public class RotateArray {
	public void rotate(int[] nums,int k) {
		int n = nums.length;
		k = k%n;
		reverse(nums,0,n-1);
		reverse(nums,0,k-1);
		reverse(nums,k,n-1);
	}
	public void reverse(int[] nums,int low , int high) {
		while(low < high) {
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			low++;
			high--;
		}
	}
	public static void main(String args[]) {
		RotateArray ra = new RotateArray();
		int[] arr = {5,8,7,5,8,6,2,5,2};
		int k = 2;
		ra.rotate(arr, k);
		System.out.println(Arrays.toString(arr));
		
	}
}
