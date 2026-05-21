class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        for(int i=0;i<nums.length;i++){
            p*=nums[i];
        }
        int[] a=new int[nums.length];
        int s=1;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
             a[j]=p/nums[j];}
            else if(nums[j]==0){
                for(int k=0;k<nums.length;k++){
                    if(k!=j)
                      s=s*nums[k];
                }
            a[j]=s;
            }
        }
    return a;
    }
}