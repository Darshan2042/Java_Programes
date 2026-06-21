package TestJava;
import java.util.Arrays;

public class insertionSort {
    public void insertion(int[] nums){
        for(int i=1 ; i<nums.length ; i++){
            int j = i;
            while(j >= 0 && nums[j] < nums[j-1]){
                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }
    public static void main(String args[]){
        int[] arr = {20,50,40,60,50,30,50,60,400,30};
        insertionSort i = new insertionSort();
        i.insertion(arr);
        System.out.println(Arrays.toString(arr));
    }    
}
