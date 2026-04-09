class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min=bloomDay[0];
        int max=bloomDay[0];
        int n=bloomDay.length;
        for(int i=0;i<n;i++){
           if(min>bloomDay[i])
                   min= bloomDay[i];
           else if(max<bloomDay[i])
                    max=bloomDay[i];
        }
        if(n<(long)m*k){
                return -1;
                    
            }
        while(min<=max){
            int mid=min+(max-min)/2;
            int t=0;
            int b=0;
            for(int j=0;j<n;j++){
                    if(bloomDay[j]<=mid){
                        t++;
                        if(t==k){
                            b++;
                            t=0;
                        }
                    }
                    else
                       t=0;

                }
            if(b>=m){
                max=mid-1;
            }
            else
               min=mid+1;
            }
        return min;
        }

    }
