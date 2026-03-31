class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int left=-1;
        int right=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                left=mid;
                r=mid-1;
            }
            else if(nums[mid]<target)
               l=mid+1;
            else 
              r=mid-1;
        }
        int s=0;
        int y=nums.length-1;
         while(s<=y){
            int mid=s+(y-s)/2;
            if(nums[mid]==target){
                right=mid;
                s=mid+1;
            }
            else if(nums[mid]<target)
               s=mid+1;
            else 
              y=mid-1;
        }
        return new int[]{left,right};
    }
}