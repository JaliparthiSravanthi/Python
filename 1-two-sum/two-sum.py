class Solution:
    def twoSum(self, nums, target):
        dict_1={}
        for i in range(0,len(nums)):
            n=nums[i]
            result=target-n
            if result in dict_1:
                return[dict_1[result],i]
            dict_1[n]=i
        return []
