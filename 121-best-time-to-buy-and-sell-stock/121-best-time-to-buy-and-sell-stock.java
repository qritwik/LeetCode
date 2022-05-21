class Solution {
    public int maxProfit(int[] prices) {
        int price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] <= price) {
                price = prices[i];
            }
            else {
                int profit = prices[i] - price;
                max_profit = Math.max(profit, max_profit);
            }
        }
        return max_profit;
    }
}