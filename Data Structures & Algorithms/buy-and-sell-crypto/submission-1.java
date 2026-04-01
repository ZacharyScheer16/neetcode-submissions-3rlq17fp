class Solution {
    public int maxProfit(int[] prices) {

        int minProfit = 100000;
        int maxProfit = 0;

        for(int i =0; i < prices.length; i++){
            //establish min profit
            minProfit = Math.min(minProfit, prices[i]);

            int profit  = prices[i] - minProfit;

            maxProfit = Math.max(maxProfit, profit);

        }

        return maxProfit;
        
    }
}
