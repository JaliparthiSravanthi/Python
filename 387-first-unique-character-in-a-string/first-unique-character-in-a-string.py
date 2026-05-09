class Solution(object):
    def firstUniqChar(self, s):
       d={}
       for i in s:
        d[i]=d.get(i,0)+1
       for j in range(len(s)):
        if d[s[j]]==1:
            return j
       return -1