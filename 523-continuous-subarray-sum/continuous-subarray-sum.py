class Solution(object):
    def checkSubarraySum(self, nums, k):
     d={0:-1}
     sum=0
     for i in range(len(nums)):
        sum+=nums[i];
        if sum%k in d:
            if((i-d[sum%k])>=2):
               return True
        else:
            d[sum%k]=i
     return False
        



