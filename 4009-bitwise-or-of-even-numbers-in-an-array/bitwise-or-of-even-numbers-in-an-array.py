class Solution(object):
    def evenNumberBitwiseORs(self, nums):
       lst=[]
       for i in nums:
        if  i%2==0:
            lst.append(i)
       if len(lst)==0:
        return 0
       s=lst[0]
       for i in range(1,len(lst)):
        s=s|lst[i]
       return s
    
       