class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        int currentProfit = 0;

        //linear search thorgh, strwe min price as we got through, min price
        for(int p: prices){
            if(p < minPrice){
                minPrice = p;
            }
            currentProfit = p - minPrice;

            maxProfit = Math.max(currentProfit, maxProfit);
        }
        //then domin curr price - min Priceand see if greatest profit

        return maxProfit;
        
    }
}
