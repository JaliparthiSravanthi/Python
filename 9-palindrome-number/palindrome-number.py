class Solution(object):
    def isPalindrome(self, x):
        if x<0:
            return False
        result=0
        s=x
        while(x!=0):
         a=x%10
         result=result*10+a
         x=x//10
        if result==s:
            return True
        else:
            return False








        


        