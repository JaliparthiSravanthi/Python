class Solution(object):
    def gcdOfOddEvenSums(self, n):
       sumodd=n**2
       sumeven=n*(n+1)
       c=1
       for i in range(1,n+1):
        if(sumodd%i==0 and sumeven%i==0):
            c=i
       return c

        