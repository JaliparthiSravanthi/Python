class Solution(object):
    def rotate(self, nums, k):
       n=len(nums)
       k=k%n
       temp=[0]*k;
       for i in range(0,k):
           temp[i]=nums[n-k+i]
       for j in range(n-1,k-1,-1):
           nums[j]=nums[j-k] 
       for m in range(0,k):
           nums[m]=temp[m]
       return nums
        