package Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestSeq(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 0;
        for(int num : set){
            // Start only from sequence beginning
            if(!set.contains(num - 1)){
                int current = num;
                int count = 1;
                while(set.contains(current + 1)){
                    current++;
                    count++;
                }
            max = Math.max(max, count);
        }
    }

    return max;

    }
    public static void main(String args[]){
        LongestConsecutiveSequence l = new LongestConsecutiveSequence();
        int[] arr = {100,4,200,1,3,2};
        int res = l.longestSeq(arr);
        System.out.println(res);
    }
}
