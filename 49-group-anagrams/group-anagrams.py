class Solution(object):
    def groupAnagrams(self, strs):
      l=[]
      for i in strs:
        l.append("".join(sorted(i)))
        d={}
      for k in range(len(l)):
        key=l[k]
        if key in d:
            d[key].append(strs[k])
        else:
            d[key]=[strs[k]]
      return list(d.values())
