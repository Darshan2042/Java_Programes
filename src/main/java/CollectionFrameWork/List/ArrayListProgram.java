package CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {
	public int largestNumber(int[] nums) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			arr.add(nums[i]);
		}
		int lar = Collections.max(arr);
		return lar;
	}

	public static void main(String args[]) {
		ArrayListProgram a = new ArrayListProgram();
		int[] nums = { 50, 90, 40, 60, 30, 70, 50, 85, 45 };
		System.out.println(a.largestNumber(nums));
	}
}
