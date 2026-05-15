class Solution(object):
    def number(self, nums, k):
      d={}
      c=0
      l=0
      value=0
      for i in range(len(nums)):
        d[nums[i]]=d.get(nums[i],0)+1
        if(nums[i]%2!=0):
            value+=1
        while(value>k):
            d[nums[l]]-=1
            if(nums[l]%2!=0):
                value-=1
            l+=1
        c+=i-l+1
      return c
    def numberOfSubarrays(self, nums, k):
        return self.number(nums,k)-self.number(nums,k-1)
    