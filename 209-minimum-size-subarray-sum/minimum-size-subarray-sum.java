class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int mlen=Integer.MAX_VALUE;
       int l=0;
       int sum=0;
       for(int r=0;r<nums.length;r++){
        sum+=nums[r];
        while(sum>=target){
            mlen=Math.min(mlen,r-l+1);
            sum-=nums[l];
            l++;
        }
       }
    return mlen==Integer.MAX_VALUE?0:mlen;  
    }
}