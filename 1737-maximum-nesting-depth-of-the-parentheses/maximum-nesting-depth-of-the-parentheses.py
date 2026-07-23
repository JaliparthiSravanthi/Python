class Solution(object):
    def maxDepth(self, s):
       counter=0
       mc=0
       for i in s:
        if(i=='('):
            counter+=1
        elif(i==')'):
            counter-=1
        mc=max(mc,counter)
       return mc
        