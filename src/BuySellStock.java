public class BuySellStock {

    public int maxProfit(int[] prices){
        int minSoFar = prices[0];
        int ans = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minSoFar;
            if (profit > ans) {
                ans = profit;
            }
            minSoFar = Math.min(prices[i], minSoFar);
        }
        return ans;
    }
}
