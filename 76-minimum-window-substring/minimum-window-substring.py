class Solution(object):
    def minWindow(self, s, t):
        n1=len(s)
        n2=len(t)
        d1={}
        d2={}
        if(n2>n1):
            return ""
        for i in range(n2):
            d2[t[i]]=d2.get(t[i],0)+1
        l=0
        have=0
        need=len(d2)
        length=float('inf')
        res=[-1,-1]
        for j in range(n1):
            d1[s[j]]=d1.get(s[j],0)+1
            if s[j] in d2 and d1[s[j]]==d2[s[j]]:
                have+=1
            while have==need:
                    if (j-l+1) < length:
                        length=j-l+1
                        res=[l,j]
                    d1[s[l]]-=1
                    if s[l] in d2 and d1[s[l]]<d2[s[l]]:
                        have-=1
                    l+=1
        l,j=res
        return s[l:j+1] if length!=float('inf') else ""

                
            
        

            
        