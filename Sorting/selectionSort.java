package Sorting;
/*
1.Start from the first position
2.Find the smallest element in the whole array
3.Swap it with the first position
4.Move to next position
5.Again find smallest from remaining array
6.Swap it to correct position
7.Repeat until array is sorted

Time Complexity:
 Best Case: O(n²)
 Average Case: O(n²)
 Worst Case: O(n²)

Space Complexity:
 O(1)  (in-place sorting)
*/
public class selectionSort {
    public static void main(String args[]){
    int[] nums= {50,40,10,20,50,60,40,80,20};
    for(int i =0;i<nums.length-1;i++){
        int min_index = i;
        for(int j = i+1 ; j < nums.length;j++){
            if (nums[j] < nums[min_index]) {
                min_index = j;
            }

            int temp = nums[i];
            nums[i]=nums[min_index];
            nums[min_index] = temp;
        }
    }
    for (int num : nums) {
            System.out.print(num + " ");
        }

}
}
