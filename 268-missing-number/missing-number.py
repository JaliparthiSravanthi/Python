class Solution(object):
    def missingNumber(self, nums):
        n=len(nums)
        total=n*(n+1)//2
        sum=0
        for i in nums:
            sum+=i
        return total-sum

        