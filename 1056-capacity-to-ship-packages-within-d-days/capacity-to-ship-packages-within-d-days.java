class Solution {
    public int shipWithinDays(int[] weights, int days) {
      int l=weights[0];
      int r=0;
      int mid=0;
      for(int i=0;i<weights.length;i++){
        if(l<weights[i])
            l=weights[i];
        r+=weights[i];
      }  
      while(l<=r){
         mid=l+(r-l)/2;
         int d=1;
        int sum=0;
        for(int j=0;j<weights.length;j++){
            if(sum+weights[j]>mid){
               d++;
               sum=weights[j];
            }
            else
               sum+=weights[j];
        }
        if(d<=days)
               r=mid-1;
        else
              l=mid+1;

      }
      return l;
    }
}