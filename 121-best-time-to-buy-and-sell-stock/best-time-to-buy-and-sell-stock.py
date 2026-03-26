class Solution(object):
    def maxProfit(self, prices):
        buy=prices[0]
        profit=0
        mprofit=0
        for i in range(1,len(prices)):
            if(prices[i]<buy):
                buy=prices[i]
            if(prices[i]>buy):
                profit=prices[i]-buy
            if(profit>mprofit):
                mprofit=profit
        return mprofit            