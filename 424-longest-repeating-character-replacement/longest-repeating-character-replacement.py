class Solution(object):
    def characterReplacement(self, s, k):
       l=0
       d={}
       maxf=0
       mlen=0
       for r in range(len(s)):
        d[s[r]]=d.get(s[r],0)+1
        maxf=max(maxf,d[s[r]])
        while((r-l+1)-maxf>k):
            d[s[l]]-=1
            l+=1
        mlen=max(mlen,r-l+1)
       return mlen