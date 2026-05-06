class Solution(object):
    def lengthOfLongestSubstring(self, s):
      mlen=0
      d={}
      l=0
      for i in range(len(s)):
       if s[i] in d:
        l=max(l,d[s[i]]+1)

       d[s[i]]=i
       mlen=max(mlen,i-l+1)
      return mlen
    

            
                


            
        
    

        