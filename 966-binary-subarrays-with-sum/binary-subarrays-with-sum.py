class Solution(object):
    def numSubarraysWithSum(self, nums, goal):
        sum=0
        d={0:1}
        c=0
        for i in nums:
            sum+=i
            if sum-goal in d:
                c+=d[sum-goal]
            d[sum]=d.get(sum,0)+1
        return c
