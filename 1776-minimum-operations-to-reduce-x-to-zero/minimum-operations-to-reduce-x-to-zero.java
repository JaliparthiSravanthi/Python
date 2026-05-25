class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int lar=0;
        for(int i=0;i<n;i++){
            lar+=nums[i];
        }
        if(lar<x) return -1;
        int l=0;
        int mlen=0;
        int sum=0;
        int tar=lar-x;
        if(tar==0) return n;
        for(int j=0;j<n;j++){
            sum+=nums[j];
            while(sum>tar){
                sum-=nums[l];
                l++;
            }
        if(sum==tar){
            mlen=Math.max(mlen,j-l+1);
        }
        }
    return mlen==0?-1:n-mlen;
    }
}