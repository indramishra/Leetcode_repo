class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = Integer.MIN_VALUE;
       int start = 0;
       if(prices.length == 1) {
        return 0;
       }
       for(int i=1; i < prices.length; i++) {
            if(prices[i] <= prices[start] ) {
                start = i;
            }
            
            maxProfit = Math.max(prices[i] - prices[start], maxProfit);
       }
       return maxProfit;
    }
}