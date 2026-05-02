class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=piles[0];
        int min =0;
        for(int i=0;i<piles.length;i++){
            if(r<piles[i])
                r=piles[i];
        }
        while(l<=r){
            int mid=l+(r-l)/2;
             int sum=0;
            for(int j=0;j<piles.length;j++){
                sum+=(piles[j]+mid-1)/mid;
                if(sum>h) break;
            }
            if(sum<=h){
                min=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return min;
    }
}