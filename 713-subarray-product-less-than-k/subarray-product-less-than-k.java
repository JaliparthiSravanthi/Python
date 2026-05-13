class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int l=0;
       int pro=1;
       int c=0;
       if(k<=1) return 0;
       for(int i=0;i<nums.length;i++){
        pro*=nums[i];
        while(pro>=k){
            pro=pro/nums[l];
            l++;
        }
        c+=(i-l+1);
       } 
    return c;
    }
}