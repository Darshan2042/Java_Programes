package Logic_Building;
import java.util.Arrays;
public class moveZeros {
    int[] getarray(int[] nums){
        int j = 0;
        for(int i=0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;

    }

    public static void main(String args[]){
        moveZeros m = new moveZeros();
        int[] arr = {0,1,0,3,12};
        int [] res = m.getarray(arr);
        System.out.println(Arrays.toString(res));
    }
    
}
