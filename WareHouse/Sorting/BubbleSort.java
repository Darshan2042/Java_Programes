package Sorting;

public class BubbleSort implements Sort {
	public void sort(int[] nums) {
		System.out.println("Initial Array:");
		printArray(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			System.out.println("\nPass " + (i + 1));
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					System.out.println("Swap " + nums[j] + " and " + nums[j + 1]);
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					printArray(nums);
				}
			}
		}
		System.out.println("\nSorted Array:");
		printArray(nums);
	}

	private void printArray(int[] nums) {
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}