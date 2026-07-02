package Sorting;

import java.util.ArrayList;

public class MergeSort implements Sort {
	public void sort(int[] nums) {
		mergeSort(nums, 0, nums.length - 1);
		System.out.println("\nMerge Sort Representation:");
		printArray(nums);
	}

	private void mergeSort(int[] nums, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSort(nums, low, mid);
		mergeSort(nums, mid + 1, high);
		merge(nums, low, mid, high);
	}

	private void merge(int[] nums, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid + 1;
		while (left <= mid && right <= high) {
			if (nums[left] <= nums[right]) {
				temp.add(nums[left]);
				left++;
			} else {
				temp.add(nums[right]);
				right++;
			}
		}
		while (left <= mid) {
			temp.add(nums[left]);
			left++;
		}
		while (right <= high) {
			temp.add(nums[right]);
			right++;
		}
		for (int i = low; i <= high; i++) {
			nums[i] = temp.get(i - low);
		}
		System.out.print("Merged [" + low + "-" + high + "] : ");
		printArray(nums);
	}

	private void printArray(int[] nums) {
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}