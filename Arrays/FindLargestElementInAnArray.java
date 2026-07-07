package Arrays;
import java.util.Arrays;

public class FindLargestElementInAnArray {
    public int largest(int[] nums){
        int largestnumber = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i] > largestnumber){
                largestnumber = nums[i];
            }
        }
        return largestnumber;
    }

    public int usingSoting(int[] num){
        Arrays.sort(num);
        return num[num.length-1];
    }

    public static void main(String args[]){
        FindLargestElementInAnArray lar = new FindLargestElementInAnArray();
        int[] num = {10,20,30,50,40,50,50,20,10,05,050,50,05,060,0,100};
        System.out.println(lar.largest(num));
        System.out.println(lar.usingSoting(num));
    }
}
