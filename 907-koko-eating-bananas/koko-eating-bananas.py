class Solution(object):
    def minEatingSpeed(self, piles, h):
        l=1
        r=max(piles)
        ans=r
        while(l<=r):
            k=l+(r-l)//2
            t=0
            for i in piles:
                t+=(i+k-1)//k
                if(t>h):
                    break
            if(t<=h):
                ans=k
                r=k-1
            else:
                l=k+1
        return ans
             
