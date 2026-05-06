class Solution(object):
    def groupAnagrams(self, strs):
      l=[]
      for i in strs:
        l.append("".join(sorted(i)))
      d={}
      for j in range(len(l)):
        k=l[j]
        if k in d:
            d[l[j]].append(strs[j])
        else:
            d[l[j]]=[strs[j]]
      return list(d.values())

