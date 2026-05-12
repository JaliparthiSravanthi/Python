class Solution(object):
    def helper(self,nums,k):
        d={}
        l=0
        c=0
        value=0
        for i in range(len(nums)):
            if nums[i] in d:
                d[nums[i]]+=1
            else:
                d[nums[i]]=1
                value+=1
            while(value>k):
                d[nums[l]]-=1
                if(d[nums[l]]==0):
                    del d[nums[l]]
                    value-=1
                l+=1
            c+=i-l+1
        return c

    def subarraysWithKDistinct(self, nums, k):
        return self.helper(nums,k)-self.helper(nums,k-1)
       