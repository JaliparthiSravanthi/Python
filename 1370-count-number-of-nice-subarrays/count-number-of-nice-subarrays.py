class Solution(object):
    def numberOfSubarrays(self, nums, k):
     l=0
     value=0
     prefix=0
     c=0
     for i in range(len(nums)):
        if(nums[i]%2!=0):
            value+=1
            prefix=0
        while(value>k):
            if(nums[l]%2!=0):
                value-=1
            l+=1
        while (value==k and nums[l]%2==0):
            prefix+=1
            l+=1
        if(value==k):
            c+=prefix+1
     return c
