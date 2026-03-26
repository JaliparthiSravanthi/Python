class Solution(object):
    def maxSubArray(self, nums):
        sum=0
        lsum=-2177788888
        for i in nums:
        
            if(sum>=0):
                sum+=i
            else:
                sum=i
            if(sum>lsum):
                lsum=sum
        return lsum