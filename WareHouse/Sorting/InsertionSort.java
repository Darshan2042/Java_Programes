package Sorting;

public class InsertionSort implements Sort {
	public void sort(int[] nums) {
		System.out.println("Initial Array:");
		printArray(nums);
		for (int i = 1; i < nums.length; i++) {
			int key = nums[i];
			int j = i - 1;
			System.out.println("\nPass " + i);
			System.out.println("Key = " + key);
			while (j >= 0 && nums[j] > key) {
				System.out.println("Shift " + nums[j] + " to index " + (j + 1));
				nums[j + 1] = nums[j];
				j--;
				printArray(nums);
			}
			nums[j + 1] = key;
			System.out.println("Insert " + key + " at index " + (j + 1));
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