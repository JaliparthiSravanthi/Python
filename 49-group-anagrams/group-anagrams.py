class Solution(object):
    def groupAnagrams(self, strs):
        l=[]
        for i in strs:
            l.append("".join(sorted(i)))
        d={}
        for i in range(len(l)):
            k=l[i]
            if k in d:
                d[k].append(strs[i])
            else:
                d[k]=[strs[i]]
        return list(d.values())

        