package Sorting;

public class SelectionSort implements Sort {
	public void sort(int[] nums) {
		System.out.println("Initial Array:");
		printArray(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			int min_index = i;
			System.out.println("\nPass " + (i + 1));
			System.out.println("Current Minimum = " + nums[min_index]);
			for (int j = i + 1; j < nums.length; j++) {
				System.out.println("Compare " + nums[min_index] + " and " + nums[j]);
				if (nums[min_index] > nums[j]) {
					min_index = j;
					System.out.println("New Minimum = " + nums[min_index]);
				}
			}
			if (min_index != i) {
				System.out.println("Swap " + nums[i] + " and " + nums[min_index]);
				int temp = nums[min_index];
				nums[min_index] = nums[i];
				nums[i] = temp;
			} else {
				System.out.println("No Swap Needed");
			}
			printArray(nums);
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