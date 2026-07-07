package Sorting;
/*
1.Start from index 0
2.For each element, set j = i
3.Compare current element with previous element (nums[j-1])
4.If previous element is greater → swap them
5.Move one step left (j--)
6.Repeat until correct position is found or j = 0
7.Continue for all elements

Time Complexity
Best Case: O(n) → already sorted
Average Case: O(n²)
Worst Case: O(n²)
*/
public class insertionSort {
    public static void main(String args[]){
        int [] nums = {20,40,8,4,6,2,10,3,0};
        for(int i = 0 ; i < nums.length ; i++){
            int j = i;
            while(j > 0 && nums[j-1] > nums[j]){
                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        for(int num:nums){
            System.out.print(num + " ");
        }
    }
    
}
