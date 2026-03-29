class Solution(object):
    def numSubarraysWithSum(self, nums, goal):
        sum=0
        c=0
        d={0:1}
        for i in nums:
            sum+=i
            if sum-goal in d:
                c+=d[sum-goal]
            if sum in d:
                d[sum]+=1
            else:
                d[sum]=1
        return c
