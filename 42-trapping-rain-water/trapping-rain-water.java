class Solution {
    public int trap(int[] height) {
        int t=0;
        int leftmax=0;
        int n=height.length;
        int[] suffixmax=new int[n];
        suffixmax[n-1]=height[n-1];
        for (int j=n-2;j>=0;j--){
            suffixmax[j]=Math.max(height[j],suffixmax[j+1]);
        }
        for(int i=0;i<n;i++){
            if(height[i]>leftmax)
                leftmax=height[i];
            int rightmax=suffixmax[i];
            t+=Math.min(leftmax,rightmax)-height[i];
        }
    return t;
    }
}