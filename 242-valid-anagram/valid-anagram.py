class Solution(object):
    def isAnagram(self, s, t):
        d={}
        d1={}
        if(len(s)!=len(t)):
            return False
        for i in s:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        for j in t:
            if j in d1:
                d1[j]+=1
            else:
                d1[j]=1
        for key in s:
            if key not in t:
                return False
            if d[key]!=d1[key]:
                return False
        return True