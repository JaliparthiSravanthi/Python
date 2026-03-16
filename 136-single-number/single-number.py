class Solution(object):
    def singleNumber(self, nums):
       d={}
       for i in nums:
        if i in d:
            d[i]+=1
        else:
            d[i]=1
       for key in d:
            if d[key]==1:
                return key

        
    