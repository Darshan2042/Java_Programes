package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class SingleNumber {
    public int usingArray(int[] nums){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : nums){
            if(arr.contains(num)){
                arr.remove(Integer.valueOf(num));
            }
            else{
                arr.add(num);
            }
        }
        return arr.get(0);
    }

    public int usingHashmap(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            int num = nums[i];
            map.put(num,map.getOrDefault(num,0 )+1);
        }
        for(int i=0 ; i<nums.length; i++){
            if(map.get(nums[i]) == 1 ){
                return nums[i];
            }
        }
        return -1;
    }
    public int usingXOR(int[] nums){
        int xor = 0;
        for(int num:nums){
            xor ^= num;
        }
        return xor;
    }
    public static void main(String args[]){
        SingleNumber s = new SingleNumber();
        int[] nums = {4,1,2,1,2};
        System.out.println(s.usingArray(nums));
        System.out.println(s.usingHashmap(nums));
        System.out.println(s.usingXOR(nums));
    }
    
}
