class Solution {
    int count(int m,int n,int val){
        int c=0;
        for(int i=1;i<=m;i++){
            c+=Math.min(n,val/i);
        }
        return c;
    }
    public int findKthNumber(int m, int n, int k) {
       int low=1;
       int high=m*n;
       while(low<=high){
        int mid=low+(high-low)/2;
         int c=count(m,n,mid);
         if(c<k) low=mid+1;
         else   high=mid-1;
       }
       return low;
    }
}