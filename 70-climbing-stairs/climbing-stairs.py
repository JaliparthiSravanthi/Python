class Solution(object):
    def climbStairs(self, n):
        lst=[]
        if n<=2:
            return n
        lst=[1,2]
        for i in range(2,n+1):
            lst.append(lst[i-1]+lst[i-2])
        return lst[n-1]

        