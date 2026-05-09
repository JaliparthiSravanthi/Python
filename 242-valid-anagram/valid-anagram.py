class Solution(object):
    def isAnagram(self, s, t):
       d={}
       if(len(s)!=len(t)):
        return False
       for i in s:
        d[i]=d.get(i,0)+1
       for j in range(len(t)):
        if(t[j] in d):
            d[t[j]]-=1
            if(d[t[j]]==0):
                del d[t[j]]
        else:
            return False
       return True