class Solution(object):
    def longestConsecutive(self, nums):
       if not nums:
        return 0
       s=set(nums)
       ans=0
       for m in s:
        if m-1 not in s:
            c=1
            while(m+1 in s):
                m=m+1
                c+=1
            ans=max(ans,c)
       return ans