class Solution {
    public int maximumCount(int[] nums) {
        int le=nums.length;
        int l=0;
        int r=nums.length-1;
        int n=-1;
        int p=le;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<0){
                n=mid;
                l=mid+1;
            }
            else
              r=mid-1;
        }
        n=n+1;
        int s=0;
        int y=nums.length-1;
         while(s<=y){
            int mid=s+(y-s)/2;
            if(nums[mid]>0){
                p=mid;
               y=mid-1;
            }
            else
             s=mid+1;
        }
        p=le-p;
        return Math.max(p,n);
        
    }
}