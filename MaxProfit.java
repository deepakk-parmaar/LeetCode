public class MaxProfit {
    public int maxProfit(int prices[]) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int maxprofit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = prices[i] - min;
            maxprofit = Math.max(profit, maxprofit);
        }
        return maxprofit;
    }
}
