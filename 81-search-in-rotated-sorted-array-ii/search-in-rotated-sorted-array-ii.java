class Solution {
    public boolean search(int[] nums, int target) {
        int k=-1;
        int n=nums.length-1;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[i+1]){
                k=i;
                break;
            }
        }
        int l=0;int r=k;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target)
               return true;
            else if(nums[mid]<target)
                  l=mid+1;
            else
              r=mid-1;
        }
        int s=k+1;
        int y=n;
        while(s<=y){
            int mid=s+(y-s)/2;
            if(nums[mid]==target)
               return true;
            else if(nums[mid]<target)
               s=mid+1;
            else
               y=mid-1;

        }
        return false;
    }
}