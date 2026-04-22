class Solution {
    public int[] sortedSquares(int[] nums) {
        int len=nums.length;
       int[] n=new int[len];
       int k=0;
       int j=len-1;
       int pos=len-1;
       while(k<=j){
        int l=nums[k]*nums[k];
        int r=nums[j]*nums[j];
        if(l>r){
            n[pos]=l;
            k++;
        }
        else{
            n[pos]=r;
            j--;
        }
        pos--;
       }
    return n;
    }
}