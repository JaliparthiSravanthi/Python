class Solution(object):
    def subarraySum(self, nums, k):
        d={0:1}
        sum=0
        c=0
        for i in nums:
            sum+=i
            if sum-k in d:
                c+=d[sum-k]
            d[sum]=d.get(sum,0)+1
        return c 
