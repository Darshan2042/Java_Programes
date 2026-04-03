import java.util.HashMap;

class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int res = target - nums[i];

            if(map.containsKey(res)){
                return new int[]{map.get(res), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Two_sum obj = new Two_sum();

        int[] nums = {2, 7, 11, 15};
        int target = 18;

        int[] result = obj.twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}