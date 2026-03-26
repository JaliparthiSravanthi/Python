class Solution(object):
    def findMaxAverage(self, nums, k):
        sum=0;
        msum=0;
        for i in range(0,k):
            sum+=nums[i]
        msum=sum
        for i in range(k,len(nums)):
            sum=sum-nums[i-k]+nums[i]
            if(sum>msum):
                msum=sum
        return float(msum)/k


        