class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        n=sorted(nums)
        d={}
        for i in range(0,len(n)):
            if n[i] not in d:
                d[n[i]]=i
        result=[]
        for j in nums:
            if j in d:
                result.append(d[j])
        return result


