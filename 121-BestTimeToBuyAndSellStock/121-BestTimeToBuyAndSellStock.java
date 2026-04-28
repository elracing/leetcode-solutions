// Last updated: 4/28/2026, 10:46:40 AM
class Solution {
    public int maxProfit(int[] prices) {

        int buyingPrice = prices[0];

        int maxProfit = 0;


        for (int i = 1; i < prices.length ; i++){
            if (buyingPrice > prices[i]){
                buyingPrice = prices[i];
            }

            else{
                int sellToday = prices[i] - buyingPrice;
                if (sellToday > maxProfit){
                    maxProfit = sellToday;
                }
            }

        }

        return maxProfit;

        
    }
}