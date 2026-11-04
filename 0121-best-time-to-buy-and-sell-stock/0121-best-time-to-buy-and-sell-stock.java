class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int sell=0;
        int profit=0;
        for(int i=1; i<prices.length; i++){
            sell=prices[i]-buy;
            profit=Math.max(profit,sell);
            
            if(buy>prices[i]){
                buy=prices[i];
            }
        }
        return profit;
    }
}