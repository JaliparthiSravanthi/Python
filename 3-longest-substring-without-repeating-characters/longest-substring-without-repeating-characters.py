class Solution(object):
    def lengthOfLongestSubstring(self, s):
        mlen=0
        cset=[]
        l=0
        for i in range(len(s)):
            while(s[i] in cset):
                cset.remove(s[l])
                l+=1
            cset.append(s[i])
            mlen=max(mlen,i-l+1)
        return mlen
            
                


            
        
    

        