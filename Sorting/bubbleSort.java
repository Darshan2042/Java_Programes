package Sorting;
/*
1.Start from the first element
2.Compare it with the next element
3.If first is bigger → swap
4.Move one step ahead and repeat
5.After one round, the biggest number goes to the end
6.Repeat the process for remaining elements

Time Complexity:
 Best Case: O(n)   (when array is already sorted)
 Average Case: O(n²)
 Worst Case: O(n²)

Space Complexity:
 O(1)  (in-place sorting)
*/
public class bubbleSort {
    public static void main(String args[]){
    int[] nums = {29,443,23,2,4,23,32,3,42,3,423,23,23,2424,232};
    for(int i =0 ; i< nums.length-1;i++){
        for(int j=0;j<nums.length-1-i;j++){      // largest element is already at the end  n-i-1
            if (nums[j] > nums[j+1]) {
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
    }
    for (int num : nums) {
            System.out.print(num + " ");
        }
}
}