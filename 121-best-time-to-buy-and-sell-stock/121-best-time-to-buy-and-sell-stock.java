class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min_value = prices[0];
        int max_profit = 0;
        for(int i = 1; i < n; i++) {
            int profit = prices[i] - min_value;
            max_profit = Math.max(max_profit, profit);
            if(prices[i] < min_value) {
                min_value = prices[i];
            }
        }
        return max_profit;
    }
}