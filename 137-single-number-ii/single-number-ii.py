class Solution(object):
    def singleNumber(self, nums):
       d={}
       for i in nums:
        d[i]=d.get(i,0)+1
       for k in d:
        if d[k]==1:
            return k
            