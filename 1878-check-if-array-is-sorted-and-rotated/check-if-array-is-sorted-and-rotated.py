class Solution(object):
    def check(self, nums):
        for i in range(1,len(nums)):
            if(nums[i-1]>nums[i]):
                nums=nums[i:]+nums[:i]
            
        if nums==sorted(nums):
            return True
        else:
            return False
        