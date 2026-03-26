class Solution(object):
    def maxVowels(self, s, k):
        count =0
        mcount=0
        for i in range(0,k):
            if s[i] in 'aeiou':
                count+=1
        mcount=count
        for i in range(k,len(s)):
            if(s[i-k] in 'aeiou'):
                count-=1
            if(s[i] in 'aeiou'):
                count+=1
            if(count>mcount):
                mcount=count
        return mcount
            
        