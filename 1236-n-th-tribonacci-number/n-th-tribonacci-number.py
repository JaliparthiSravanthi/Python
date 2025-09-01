class Solution(object):
    def tribonacci(self, n):
        lst=[]
        if n==0:
            return 0
        elif n==1 or n==2:
            return 1
        lst=[0,1,1]
    
        for i in range(3,n+1):
                lst.append(lst[i-1]+lst[i-2]+lst[i-3])
        return lst[n]
          
    

