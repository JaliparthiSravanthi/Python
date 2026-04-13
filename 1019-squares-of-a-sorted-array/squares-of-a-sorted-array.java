class Solution {
    public int[] sortedSquares(int[] nums) {
       for(int i=0;i<nums.length;i++){
        nums[i]=nums[i]*nums[i];
       } 
       for(int j=0;j<nums.length;j++){
        for(int k=j;k>0;k--){
            if(nums[k]<nums[k-1]){
                int temp=nums[k-1];
                nums[k-1]=nums[k];
                nums[k]=temp;
            }
            else break;
        }
       }
       return nums;
    }
}