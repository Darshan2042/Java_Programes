// Best Time to Buy and Sell Stock //
class Stock {
    public int maxProfit(int[] prices) {
      int min_price = Integer.MAX_VALUE;
      int max_profit = 0;
      for (int i= 0; i<prices.length;i++){
        if(prices[i] < min_price){
            min_price = prices[i];
        }else{
            int profit = prices[i] - min_price;
            max_profit = Math.max(profit , max_profit);
        }
      }
      return max_profit;

    }

    public static void main(String[] args) {
        Stock obj = new Stock();
        int[] nums = {2, 7, 11, 52, 48, 5};
        int result = obj.maxProfit(nums);
        System.out.println(result);
    }
}

