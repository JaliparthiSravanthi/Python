class Solution(object):
    def minDays(self, bloomDay, m, k):
        l=min(bloomDay)
        r=max(bloomDay)
        if(len(bloomDay)<m*k):
            return -1
        while(l<=r):
            mid=l+(r-l)/2
            b=0
            t=0
            for i in bloomDay:
                if(i<=mid):
                    t+=1
                    if(t==k):
                        b+=1
                        t=0
                else:
                    t=0
            if(b>=m):
                r=mid-1
            else:
                l=mid+1
        return l
                            