class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wsum=0;
        int msum=0;
        for(int i=0;i<k;i++){
            wsum+=nums[i];
        }
        msum=wsum;
        for(int j=k;j<nums.length;j++){
            wsum=wsum-nums[j-k]+nums[j];
           
            msum=Math.max(msum,wsum);

        }
        return (double)msum/k;
    }
}