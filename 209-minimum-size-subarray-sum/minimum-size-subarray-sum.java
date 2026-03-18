class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mcount=Integer.MAX_VALUE;
        int sum=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                mcount=Math.min(mcount,i-k+1);
                sum-=nums[k];
                k++;
            }

        }
        return mcount==Integer.MAX_VALUE ? 0:mcount;
        
    }
}