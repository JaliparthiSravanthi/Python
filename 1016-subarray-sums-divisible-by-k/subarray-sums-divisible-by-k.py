class Solution(object):
    def subarraysDivByK(self, nums, k):
       d={0:1}
       c=0
       sum=0
       for i in nums:
        sum+=i
        if sum%k in d:
            c+=d[sum%k]
        if sum%k in d:
            d[sum%k]+=1
        else:
            d[sum%k]=1
       return c
        