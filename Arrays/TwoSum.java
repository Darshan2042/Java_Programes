package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public int[] usingHashMap(int[] nums , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ;i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[] {map.get(comp),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        TwoSum t = new TwoSum();
        int[] arr = {10,20,50,12,30,50,60,2};
        System.out.println(Arrays.toString(t.twoSum(arr, 110)));
        System.out.println(Arrays.toString(t.usingHashMap(arr, 110)));

    }
}
