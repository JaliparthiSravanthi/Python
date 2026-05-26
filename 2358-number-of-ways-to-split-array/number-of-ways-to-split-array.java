class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        int n=nums.length;
        long[] prefix=new long[n];
        for(int i=0;i<nums.length;i++){
          sum+=nums[i];
          prefix[i]=sum;
        }
        int c=0;
        for(int j=0;j<n-1;j++){
            if(prefix[j]>=(prefix[n-1]-prefix[j])) c++;
        }
    return c;
    }
}