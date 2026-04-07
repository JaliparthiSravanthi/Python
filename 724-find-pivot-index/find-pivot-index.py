class Solution(object):
    def pivotIndex(self, nums):
        r=len(nums)-1
        n=[0]*len(nums)
        total=0
        l=0
        for i in range(len(nums)):
            total=total+nums[i]
            n[i]=total
        while l <= r:
            if l == 0 and (n[r] - n[l]) == 0:
                return 0
            elif l != 0 and n[l-1] == (n[r] - n[l]):
                return l
            l += 1
        
        return -1
            

        