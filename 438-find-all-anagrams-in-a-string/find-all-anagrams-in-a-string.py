class Solution(object):
    def findAnagrams(self, s, p):
        d1={}
        d2={}
        n1=len(s)
        n2=len(p)
        l=0
        ls=[]
        if(n2>n1):
            return []
        for i in range(n2):
            d1[s[i]]=d1.get(s[i],0)+1
            d2[p[i]]=d2.get(p[i],0)+1
        if(d1==d2):
            ls.append(l)
        for j in range(n2,n1):
            
            d1[s[l]]-=1
            if(d1[s[l]]==0):
                del d1[s[l]]
            l+=1
            d1[s[j]]=d1.get(s[j],0)+1
            if(d1==d2):
                ls.append(l)
        return ls

        