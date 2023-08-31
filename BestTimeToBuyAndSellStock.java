class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, buy = 0, sell = 0, profit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            buy = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            sell = prices[i];
            profit += sell - buy;
        }
        return profit;
        
    }
}