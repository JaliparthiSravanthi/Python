class Solution(object):
    def lengthOfLongestSubstring(self, s):
      l=0
      mlen=-1
      d={}
      k=0
      for i in range(len(s)):
        while(s[i] in d):
            d[s[l]]-=1
            if(d[s[l]]==0):
                del d[s[l]]
            l+=1
        d[s[i]]=d.get(s[i],0)+1
        mlen=max(mlen,i-l+1)
      if(mlen>-1):
        return mlen
      return 0
    

            
                


            
        
    

        