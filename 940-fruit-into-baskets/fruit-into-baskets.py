class Solution(object):
    def totalFruit(self, fruits):
        value=0
        mlen=-1
        l=0
        d={}
        for i in range(len(fruits)):
            if fruits[i] in d:
                d[fruits[i]]+=1
            else:
                d[fruits[i]]=1
                value+=1
            if(value<=2):
               mlen=max(mlen,i-l+1)
            while(value>2):
                d[fruits[l]]-=1;
                if(d[fruits[l]]==0):
                    del d[fruits[l]]
                    value-=1
                l+=1
        return  mlen
       