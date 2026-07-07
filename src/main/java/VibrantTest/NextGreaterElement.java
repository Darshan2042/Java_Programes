package VibrantTest;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	public int[] nge(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];
		Stack<Integer> stack = new Stack<>();
		for (int i = n-1; i >=0 ; i--) {
			while(!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				res[i] = -1;
			}
			else {
				res[i] = nums[stack.peek()];
			}
			stack.push(i);
		}
		return res;
	}

	public static void main(String args[]) {
		NextGreaterElement n = new NextGreaterElement();
		int[] nums = { 50, 40, 60, 10, 20, 30, 50 };
		int[] ans = n.nge(nums);
		System.out.println(Arrays.toString(ans));

	}
}
