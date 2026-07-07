package Arrays;
import java.util.HashMap;

public class MajorityElement {
    public int normal(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0 ; i<nums.length ; i++){
            if(map.get(nums[i]) > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String args[]){
        MajorityElement m = new MajorityElement();
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(m.normal(arr));
    }
    
}
