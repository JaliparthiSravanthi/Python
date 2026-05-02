class Solution(object):
    def findPeakElement(self, nums):
        i=0
        j=len(nums)-1
        while(i<j):
            mid=i+(j-i)//2
            if(nums[mid]<nums[mid+1]):
                 i=mid+1
            else:
                 j=mid
        return i