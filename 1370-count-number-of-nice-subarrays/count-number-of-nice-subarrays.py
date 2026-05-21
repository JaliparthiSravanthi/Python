class Solution(object):
    def numberOfSubarrays(self, nums, k):
     odd=0
     d={0:1}
     c=0
     for i in nums:
        if (i%2!=0):
            odd+=1
        if odd-k in d:
            c+=d[odd-k]
        d[odd]=d.get(odd,0)+1
     return c
