class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        for(int j=0;j<n;j++){
            arr[n+j]=nums[n-j-1];
        }
    return arr;
    }

}