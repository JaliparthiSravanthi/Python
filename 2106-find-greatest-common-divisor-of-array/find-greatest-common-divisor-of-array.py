class Solution(object):
    def findGCD(self, nums):
       m=min(nums)
       ma=max(nums)
       cd=1
       for i in range(1,m+1):
        if(m%i==0 and ma%i==0):
            cd=i
       return cd


        