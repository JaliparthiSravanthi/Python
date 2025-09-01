class Solution(object):
    def minCostClimbingStairs(self, cost):
        n=len(cost)
        lst=[0]*n
        lst[0]=cost[0]
        lst[1]=cost[1]
        for i in range(2,n):
            lst[i]=cost[i]+min(lst[i-1],lst[i-2])
        return min(lst[n-1],lst[n-2])