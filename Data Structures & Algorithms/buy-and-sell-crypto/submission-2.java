class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = 100000;
        int maxProfit = 0;

        for(int i =0; i < prices.length -1; i++){
            for(int j = i+1; j < prices.length; j++){
                int currentProfit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, currentProfit);
            }//inner for loop
        }//outer for
            return maxProfit;
    }
}
