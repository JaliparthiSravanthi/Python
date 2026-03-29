class Solution(object):
    def numberOfSubarrays(self, nums, k):
        c=0
        sum=0
        d={0:1}
        n=len(nums)
        lst=[0]*n
        for i in range(n):
            if(nums[i]%2==0):
                lst[i]=0
            else:
                lst[i]=1

        for i in lst:
            sum+=i
            if sum-k in d:
                c+=d[sum-k]
            if sum in d:
                d[sum]+=1
            else:
                d[sum]=1
        return c
