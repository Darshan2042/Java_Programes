package Sorting;
/*
1.Start with low = 0 and high = n-1
2.Check if low < high (more than 1 element)
3.Choose pivot element (arr[low] in your code)
4.Take two pointers:
   i = low, j = high
5.Move i forward until element > pivot
6.Move j backward until element ≤ pivot
7.If i < j → swap arr[i] and arr[j]
8.Repeat steps 5–7 until i ≥ j
9.Swap pivot (arr[low]) with arr[j]
10.Now pivot is at correct position
11.Apply same steps on left part (low to pIndex-1)
12.Apply same steps on right part (pIndex+1 to high)
13.Repeat until array is sorted
Time Complexity
Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n²)
Space Complexity
O(log n) (recursion stack)
*/

public class quickSort {
    public static void main(String args[]){
        int[] arr = {40,70,50,10,2,5,60};
        qs(arr, 0, arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void qs(int[] arr,int low,int high){
        if (low < high) {
            int pIndex  = partition(arr ,low ,high);
            qs(arr, low, pIndex -1);
            qs(arr, pIndex+1, high);
        }
    }
    public static int partition(int[] arr,int low , int high ){
        int pivot = arr[low];
        int i =low;
        int j = high;
        while(i <j){
            while (arr[i] <= pivot && i <= high-1) {
                i++;
            }
            while (arr[j] > pivot  && j >= low + 1) {
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
