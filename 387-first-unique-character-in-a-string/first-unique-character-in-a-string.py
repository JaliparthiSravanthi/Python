class Solution(object):
    def firstUniqChar(self, s):
       d={}
       l=0
       for i in s:
        if i in d:
            d[i]+=1
        else :
            d[i]=1
       for k in s:
        if(d[k]==1):
            l=k
            break;
       for j in range(len(s)):
        if(l==s[j]):
            return j
       return -1
        
        