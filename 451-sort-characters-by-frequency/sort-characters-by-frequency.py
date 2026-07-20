class Solution(object):
    def frequencySort(self, s):
       d={}
       st=""
       for i in s:
        d[i]=d.get(i,0)+1
       arr=sorted(d.items(), key=lambda x: x[1], reverse=True)
       for i,freq in arr:
        st+=i*freq
       return st
