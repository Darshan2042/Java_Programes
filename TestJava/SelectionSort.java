package TestJava;
import java.util.Arrays;
public class SelectionSort {
    public void selection(int[] nums){
        for(int i=0 ; i<nums.length-1 ; i++){
            int min_index = i;
            for(int j=i+1 ; j<=nums.length-1 ; j++){
                if(nums[j] < nums[min_index]){
                    min_index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min_index];
            nums[min_index] = temp;
        }
    }

    public static void main(String args[]){
        SelectionSort s = new SelectionSort();
        int[] arr = {54,65,25,2,54,6,63,1,5};
        s.selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
