class Solution(object):
    def lengthOfLongestSubstring(self, s):
      d={}
      l=0
      mlen=0
      for r in range(len(s)):
        if s[r] in d:
            l=max(l,d[s[r]]+1)
        d[s[r]]=r
        mlen=max(mlen,r-l+1)
      return mlen
            
                


            
        
    

        