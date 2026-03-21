class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0;
        int b=0;
        for(int i=0;i<nums.length-1;i++){
            int sum=0;
            for(int j=i+1;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                    a=i;
                    b=j;
                }
                else
                   sum=sum-nums[j];
                    
            }
        }
        return new int[]{a,b};
    }
}