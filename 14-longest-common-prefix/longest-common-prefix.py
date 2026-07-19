class Solution(object):
    def longestCommonPrefix(self, strs):
        st=""
        ms=len(strs[0])
        for i in range(len(strs)):
            if(ms>len(strs[i])):
                ms=len(strs[i])
        for j in range(ms):
            s=strs[0][j]
            for k in range(len(strs)):
                
                if(s!=strs[k][j]):
                   return st
            st+=s
        return st

            
                