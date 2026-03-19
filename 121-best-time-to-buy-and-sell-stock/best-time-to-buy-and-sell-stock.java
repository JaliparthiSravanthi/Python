class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        int mprofit=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            if(prices[i]>buy){
                profit=prices[i]-buy;
            }
            if(profit>mprofit){
                mprofit=profit;
            }
        }
       if(mprofit==Integer.MIN_VALUE)
            return 0;
        else
            return mprofit;
    }
}