class Solution(object):
    def removeDuplicates(self, nums):
       k=0
       for i in range(1,len(nums)):
        if(nums[i]!=nums[i-1]):
            k+=1
            nums[k]=nums[i]
       return k+1

       
