class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }
    static int helper(int[] nums,int t,int i,int s){
        if(i==nums.length){
            if(s==t){
                return 1;
            }
        return 0;
        }
        int l=helper(nums,t,i+1,s+nums[i]);
        int r=helper(nums,t,i+1,s-nums[i]);
        return l+r;
    }
}