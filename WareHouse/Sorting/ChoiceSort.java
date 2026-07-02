package Sorting;

import java.util.Scanner;

public class ChoiceSort {
	private Scanner sc = new Scanner(System.in);

	public void menu() {
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		inputArray(nums);
		while (true) {
			System.out.println("\n========== Sorting Menu ==========");
			System.out.println("1. Bubble Sort");
			System.out.println("2. Selection Sort");
			System.out.println("3. Insertion Sort");
			System.out.println("4. Merge Sort");
			System.out.println("5. Quick Sort");
			System.out.println("6. Display Array");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			Sort s = null;
			switch (choice) {
			case 1:
				s = new BubbleSort();
				break;
			case 2:
				s = new SelectionSort();
				break;
			case 3:
				s = new InsertionSort();
				break;
			case 4:
				s = new MergeSort();
				break;
			case 5:
				s = new QuickSort();
				break;
			case 6:
				System.out.print("Current Array : ");
				printArray(nums);
				continue;
			case 7:
				System.out.println("\nThank You!");
				return;
			default:
				System.out.println("Invalid Choice! Please try again.");
				return;
			}
			s.sort(nums);
			System.out.print("\nSorted Array : ");
			printArray(nums);
		}
	}

	private void inputArray(int[] nums) {
		System.out.println("\nEnter Array Elements:");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
	}

	private void printArray(int[] nums) {
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}