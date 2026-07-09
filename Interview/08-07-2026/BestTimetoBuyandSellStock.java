public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            int profit = prices[i] - buy;
            if (profit > max) {
                max = profit;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStock obj = new BestTimetoBuyandSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(obj.maxProfit(prices));
    }
}