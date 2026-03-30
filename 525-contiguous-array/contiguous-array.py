class Solution(object):
    def findMaxLength(self, nums):
       d={0:-1}
       sum=0
       l=0
       mlen=0
       for i in range(len(nums)):
        if nums[i]==0:
            sum+=-1
        else:
            sum+=1
        if sum in d:
            l=i-d[sum]
        else:
            d[sum]=i
        mlen=max(l,mlen)
       return mlen
        




                

