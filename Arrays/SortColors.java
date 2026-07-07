package Arrays;
import java.util.Arrays;

public class SortColors {
    public void usingsort(int[] nums){
        int left = 0;
        int mid = 0;
        int right = nums.length-1;
        while(mid <= right){
            if(nums[mid] == 0){
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            }
        }
    }

    public void usinginbuild(int[] nums){
        Arrays.sort(nums);
    }
    public static void main(String args[]){
        SortColors s = new SortColors();
        int[] arr1 = {2,0,2,1,1,0};
        s.usingsort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {2,0,2,1,1,0};
        s.usinginbuild(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
