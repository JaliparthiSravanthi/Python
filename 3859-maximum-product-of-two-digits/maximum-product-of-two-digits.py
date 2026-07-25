class Solution(object):
    def maxProduct(self, n):
        l=[]
        while(n>0):
            l.append(n%10)
            n=n//10
        
        mp=0
        for i in range(len(l)):
            p=0
            for j in range(i+1,len(l)):
                p=l[i]*l[j]
                mp=max(p,mp)
        return mp
        