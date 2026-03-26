class Solution(object):
    def buildArray(self, nums):
        l=[0]*len(nums)
        for i in range(0,len(nums)):
            l[i]=nums[nums[i]]
        return l
