package Arrays;

public class BestTimetoBuyandSellStock {
    public int besttime(int[] nums){
        int buy = nums[0];
        int max_profit = 0;
        for(int i=0 ; i<nums.length ; i++){
            int cost = nums[i] - buy;
            max_profit = Math.max(max_profit,cost);
            buy = Math.min(nums[i] ,buy);
        }
        return max_profit;
    }
    public static void main(String args[]){
        BestTimetoBuyandSellStock b = new BestTimetoBuyandSellStock();
        int[] arr = {10,20,30,50,60,60,40,50,60};
        System.out.println(b.besttime(arr));
    }
}
