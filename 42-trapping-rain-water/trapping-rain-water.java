class Solution {
    public int trap(int[] height) {
      int l=0;
      int r=height.length-1;
      int t=0;
      int leftmax=0;
      int rightmax=0;
      while(l<r){
        if(height[l]<height[r]){
            if(leftmax>height[l]){
                t+=leftmax-height[l];
            }
            else leftmax=height[l];
            l++;
        }
        else{
            if(rightmax>height[r]){
                t+=rightmax-height[r];
            }
            else rightmax=height[r];
            r--;
        }
      } 
      return t;
    }
}