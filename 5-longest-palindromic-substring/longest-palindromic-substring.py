class Solution(object):
    def longestPalindrome(self, s):
        n=len(s)
        mlen=""
        for i in range(n):
            for j in range(i,n):
                substring=s[i:j+1]
                if substring==substring[ ::-1]:
                    if len(substring)>len(mlen):
                        mlen=substring
        return mlen
                        