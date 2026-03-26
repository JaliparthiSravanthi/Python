class Solution(object):
    def moveZeroes(self, nums):
        k=0
        for i in range(len(nums)):
            if(nums[i]!=0):
                temp=nums[i]
                nums[i]=nums[k]
                nums[k]=temp;
                k+=1
        return nums