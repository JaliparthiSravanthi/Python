class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroe=0;
        int mlen=Integer.MIN_VALUE;
        int l=0;
        for(int r=0;r<nums.length;r++ ){
            if(nums[r]==0){
                zeroe+=1;
            }
            if(zeroe<=k){
                    mlen=Math.max(mlen,r-l+1);
            }
            while(zeroe>k){
                if(nums[l]==0) zeroe-=1;
                l++;
            }
            
        }
        
    return mlen==Integer.MIN_VALUE?0:mlen;
    }
}