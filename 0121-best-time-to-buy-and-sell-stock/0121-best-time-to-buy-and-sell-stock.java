class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if(minPrice>prices[i]){
                minPrice=prices[i];
            }
            if(maxProfit<prices[i]-minPrice){
                maxProfit=prices[i]-minPrice;
            }
        }

        return maxProfit;
    }
}
