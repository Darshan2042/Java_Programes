package Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
public class RemoveDuplicatesFromSortedArray {
    public int[] usingarraylist(int[] nums){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }
        int[] res = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            res[i] = arr.get(i);
        }
        return res;
    }

    public int[] usingHashSet(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int[] res = new int[set.size()];
        int index = 0;
        for(int num : set){
            res[index++] = num;
        }
        return res;
    }

    // Works only for sorted array
    public int usingpointer(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int j = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
    public static void main(String args[]){
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        int[] arr = {10,20,10,20,50,60,40,50,60,3};
        System.out.println(Arrays.toString(r.usingarraylist(arr)));
        System.out.println(Arrays.toString(r.usingHashSet(arr)));
        // Sorted array for pointer method
        int[] sorted = {10,10,20,20,30,40,40,50};
        int len = r.usingpointer(sorted);
        for(int i = 0; i < len; i++){
            System.out.print(sorted[i] + " ");
        }
    }
}