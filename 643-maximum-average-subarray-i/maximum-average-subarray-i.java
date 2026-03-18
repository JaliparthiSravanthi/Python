class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wsum=0;
        double avg=0;
        double mavg=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            wsum+=nums[i];
            avg=(double)wsum/k;
        }
        mavg=avg;
        for(int j=k;j<nums.length;j++){
            wsum=wsum-nums[j-k]+nums[j];
            avg=(double)wsum/k;
            mavg=Math.max(mavg,avg);

        }
        return mavg;
    }
}