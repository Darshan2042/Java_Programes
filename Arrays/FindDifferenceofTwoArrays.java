package Arrays;

import java.util.HashSet;
import java.util.Arrays;

public class FindDifferenceofTwoArrays {
    public int[] check(int[] nums1 , int[] nums2){
        HashSet<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            if(set1.contains(num)){
                set1.remove(num);
            }
            else{
                set1.add(num);
            }
        }
        int[] temp = new int[set1.size()];
        int index = 0;
        for(int num : set1){
            temp[index++] = num;
        }
        return temp;
    }

    public static void main(String args[]){
        FindDifferenceofTwoArrays f = new FindDifferenceofTwoArrays();
        int[] arr = {1,2,5,3,6};
        int[] arr2 = {2,5,3,7};
        int[] res = f.check(arr,arr2);
        System.out.println(Arrays.toString(res));
    }

}
