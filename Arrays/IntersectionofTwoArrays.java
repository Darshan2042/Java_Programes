package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays {
    public int[] commonele(int[] nums1 , int[] nums2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }
        int[] res = new int[set2.size()];
        int i = 0;
        for(int num : set2){
            res[i++] = num;
        }
        return res;
    }

    public static void main(String args[]){
        IntersectionofTwoArrays t = new IntersectionofTwoArrays();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(t.commonele(nums1, nums2)));
    }

}
