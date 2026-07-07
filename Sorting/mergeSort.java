package Sorting;
import java.util.ArrayList;
/*
1.Start with the full array
2.Divide the array into two halves
3.Keep dividing until each part has only one element
4.Start merging the small parts
5.While merging:
6.Compare elements from both halves
7.Put the smaller one into a temporary list
8.Add remaining elements (if any)
9.Copy the sorted list back to original array
10.Repeat until full array is sorted

Time Complexity
    Best Case: O(n log n)
    Average Case: O(n log n)
    Worst Case: O(n log n)
Space Complexity
    Every Case: O(n)
*/

public class mergeSort {
    public static void main(String args[]){
        int[] arr = {80,40,20,1,2,50,3,4};
        mergeSort obj = new mergeSort();
        obj.ms(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print(num +" ");
        }
    }

    void ms(int[] arr ,int low , int high){
        if (low == high) {
            return;
        }
        int mid = (low+high)/2;
        ms(arr, low, mid);
        ms(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if (arr[left]<arr[right]) {
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            list.add(arr[left]);
            left++;
        }
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }
        for(int i =low;i<=high;i++ ){
            arr[i] = list.get(i - low);
        }
    }
}
