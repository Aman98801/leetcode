class Solution {
public int maxProfit(int[] prices) {
        if(prices.length==0) {
            return 0;
        }
        int min=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++) {
            maxprofit = Math.max(maxprofit,prices[i]-min);
            min =  Math.min(min,prices[i]);
        }
        
        return maxprofit;        
    }
}