package CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedArrays {
	public ArrayList<Integer> mergeUsingArrayList(int[] nums1, int[] nums2) {
		ArrayList<Integer> arr = new ArrayList<>();
		int len1 = nums1.length;
		int len2 = nums2.length;
		int h1 = 0;
		int h2 = 0;
		while (h1 < len1 && h2 < len2) {
			if (nums1[h1] < nums2[h2]) {
				arr.add(nums1[h1]);
				h1++;
			} else {
				arr.add(nums2[h2]);
				h2++;
			}
		}
		while (h1 < len1) {
			arr.add(nums1[h1]);
			h1++;
		}
		while (h2 < len2) {
			arr.add(nums2[h2]);
			h2++;
		}
		return arr;
	}

	public int[] mergeUsingArray(int[] nums1, int[] nums2) {
		int l1 = nums1.length;
		int l2 = nums2.length;
		int[] arr = new int[l1 + l2];
		int h1 = 0;
		int h2 = 0;
		int k = 0;
		while(h1 < l1 && h2 < l2) {
			if(nums1[h1] < nums2[h2]) {
				arr[k++] = nums1[h1++];
			}
			else {
				arr[k++] = nums2[h2++];
			}
		}
		while(h1 < l1) {
			arr[k++] = nums1[h1++];
		}
		while(h2 < l2) {
			arr[k++] = nums2[h2++];
		}
		return arr;
	}
	
	public static void main(String args[]) {
		MergeTwoSortedArrays m = new MergeTwoSortedArrays();
		int[] nums1 = { 50, 60, 80, 90, 110, 120, 135, };
		int[] nums2 = { 10, 50, 60, 70, 80, 90, 150, 178 };
		System.out.println(m.mergeUsingArrayList(nums1, nums2));
		int[] nums = m.mergeUsingArray(nums1, nums2);
		System.out.println(Arrays.toString(nums)); 
	}

}
