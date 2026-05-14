class Solution {
    public int missingNumber(int[] nums) {
        int arr=0;
        int arr2=0;
    for(int i=0;i<nums.length;i++){
        arr^=nums[i];
    }
    for(int j=0;j<=nums.length;j++){
        arr2^=j;
    }
    return arr^arr2;
    }
}