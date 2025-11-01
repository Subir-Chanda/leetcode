
class Solution {
    public int maxProfit(int[] prices) {
        int best_buy = prices[0];
        int best_sell = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            if ((prices[i] > best_buy) && (prices[i] - best_buy > best_sell)) {
                best_sell = prices[i] - best_buy;
            }
            best_buy = Integer.min(best_buy, prices[i]);
        }
        if (best_sell == Integer.MIN_VALUE) {
            return 0;
        } else {
            return best_sell;
        }        
    }
}