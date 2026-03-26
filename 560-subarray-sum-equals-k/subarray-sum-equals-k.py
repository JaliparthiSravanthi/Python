class Solution(object):
    def subarraySum(self, nums, k):
        count=0
        d={0:1}
        prefix_sum=0
        for i in nums:
           prefix_sum+=i
           if prefix_sum-k in d:
            count+=d[prefix_sum-k]
           if prefix_sum in d:
            d[prefix_sum]+=1
           else:
            d[prefix_sum]=1
        return count
           