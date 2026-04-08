class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r = piles[0];
        for(int i=1;i<piles.length;i++){
            if(r<piles[i])
               r=piles[i];
        }
        int ans=r;
      
       while(l<=r){
              int k=l+(r-l)/2;
              long total =0;
              for(int i=0;i<piles.length;i++){
               total += (piles[i] + k - 1) / k;
               if(total>h)
                 break;
              }
              if(total<=h){
                 ans=k;
                 r=k-1;
              }
              else 
                 l=k+1;
                   
        }  
    return ans;  
    }
}