class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        c=0;
        mc=0;
        for i in nums:
            if(i==1):
                c+=1
            else:
                c=0
            if(c>mc):
                mc=c
        return mc