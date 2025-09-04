class Solution(object):
    def countKDifference(self, nums, k):
       count=0
       i=0
       j=len(nums)-1
       while(i<j):
        if (nums[i]-nums[j])==k or (nums[i]-nums[j])==-k:
            count+=1
        j-=1
        if j==(i):
            i+=1
            j=len(nums)-1
        
       return count
      
        
        