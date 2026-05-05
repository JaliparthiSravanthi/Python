class Solution(object):
    def checkInclusion(self, s1, s2):
      d1={}
      d2={}
      n1=len(s1)
      n2=len(s2)
      if(n1>n2):
        return False
      for i in range(n1):
        d1[s1[i]]=d1.get(s1[i],0)+1
        d2[s2[i]]=d2.get(s2[i],0)+1
      if(d1==d2):
        return True
      for j in range(n1,n2):
        left_char=s2[j-n1]
        if left_char in d2:
           d2[left_char] -=1
           if(d2[left_char]==0):
              del d2[left_char]
        d2[s2[j]]=d2.get(s2[j],0)+1
        if(d1==d2):
            return True
      return False
    

    
      
    




