class Solution(object):
    def maxProduct(self, nums):
        maximum=max(nums)
        maximum2=maximum-1
        nums.remove(maximum)
        maximum1=max(nums)
        return maximum2*(maximum1-1)