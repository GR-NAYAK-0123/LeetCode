// Problem: Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
// Time: O(n)
// Space: o(1)

package array.Easy;

public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            } else{
                buyPrice = prices[i];
            }
        }
        if(maxProfit == Integer.MIN_VALUE){
            return 0;
        }
        return maxProfit;
    }
}
