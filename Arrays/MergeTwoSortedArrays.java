package Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedArrays {
    public int[] issort(int[] nums1 , int[] nums2){
        ArrayList<Integer> arr = new ArrayList<>();
        int first = 0;
        int second = 0;
        while(first < nums1.length && second < nums2.length){
            if(nums1[first] < nums2[second]){
                arr.add(nums1[first]);
                first++;
            }
            else{
                arr.add(nums2[second]);
                second++;
            }
        }
        while(first < nums1.length){
            arr.add(nums1[first]);
            first++;
        }
        while(second < nums2.length){
            arr.add(nums2[second]);
            second++;
        }
        int[] temp = new int[arr.size()];
        int index = 0;
        for(int num:arr){
            temp[index++] = num;
        }
        return temp;

    }
    public static void main(String args[]){
        MergeTwoSortedArrays m = new MergeTwoSortedArrays();
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = {15,23,25,78,96};
        int[] res  = m.issort(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
}
