class Solution {
    public int maxProfit(int[] prices) {
        int min_element = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_element) {
                min_element = prices[i];
            } else {
                int diff = prices[i] - min_element;
                max_profit = Math.max(diff, max_profit);
            }
        }
        return max_profit;
    }
}