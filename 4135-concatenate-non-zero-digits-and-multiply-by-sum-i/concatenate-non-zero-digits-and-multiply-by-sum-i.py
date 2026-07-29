class Solution(object):
    def sumAndMultiply(self, n):
        l=[]
        s=0
        num=0
        while(n>0):
            if(n%10!=0):
                l.append(n%10)
            n=n//10
        for i in range(len(l)-1,-1,-1):
            s+=l[i]
            num=num*10+l[i]
        return num*s

