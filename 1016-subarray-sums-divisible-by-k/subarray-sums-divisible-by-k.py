class Solution(object):
    def subarraysDivByK(self, nums, k):
     d={0:1}
     prefix=0
     c=0
     for i in nums:
        prefix+=i
        if prefix%k in d:
            c+=d[prefix%k]
        d[prefix%k]=d.get(prefix%k,0)+1
     return c

