package Arrays;
import java.util.HashSet;
import java.util.Arrays;
public class UnionofTwoArrays {
    public int[] union(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            set.add(num);
        }
        int[] res = new int[set.size()];
        int i = 0;
        for(int num : set){
            res[i++] = num;
        }
        return res;
    }

    public static void main(String[] args){
        UnionofTwoArrays u = new UnionofTwoArrays();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,3};
        System.out.println(Arrays.toString(u.union(nums1, nums2)));
    }
}