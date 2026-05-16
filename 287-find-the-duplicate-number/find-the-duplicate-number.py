class Solution(object):
    def findDuplicate(self, nums):
        d={}
        for i in nums:
            if i in d:
                return i
            else:d[i]=1
        