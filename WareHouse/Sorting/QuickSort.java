package Sorting;

public class QuickSort implements Sort {
	public void sort(int[] nums) {
		quickSort(nums, 0, nums.length - 1);
		System.out.println("\nQuick Sort Representation:");
		printArray(nums);
	}

	private void quickSort(int[] nums, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(nums, low, high);
			System.out.println("\nPivot " + nums[pivotIndex] + " placed at index " + pivotIndex);
			printArray(nums);
			quickSort(nums, low, pivotIndex - 1);
			quickSort(nums, pivotIndex + 1, high);
		}
	}

	private int partition(int[] nums, int low, int high) {
		int pivot = nums[low];
		int i = low;
		int j = high;
		while (i < j) {
			while (i <= high - 1 && nums[i] <= pivot) {
				i++;
			}
			while (j >= low + 1 && nums[j] > pivot) {
				j--;
			}
			if (i < j) {
				swap(nums, i, j);
				System.out.println("Swap " + nums[j] + " and " + nums[i]);
				printArray(nums);
			}
		}
		swap(nums, low, j);
		System.out.println("Move Pivot " + pivot + " to index " + j);
		printArray(nums);
		return j;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private void printArray(int[] nums) {
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}