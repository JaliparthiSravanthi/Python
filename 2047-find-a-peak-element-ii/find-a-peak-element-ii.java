class Solution {
    int maxim(int[][] mat,int mid){
        int max=mat[0][mid];
        int r=0;
        for(int i=0;i<mat.length;i++){
            if(max<mat[i][mid]) {
                  max=mat[i][mid];
                    r=i;
            }
        }
    return r;
    }
    public int[] findPeakGrid(int[][] mat) {
      int low=0;
      int hig=mat[0].length-1;
      while(low<=hig){
        int m=mat[0].length;
        int mid=low+(hig-low)/2;
        int row=maxim(mat,mid);
        int left=mid-1>=0?mat[row][mid-1]:-1;
        int right=mid+1<m?mat[row][mid+1]:-1;
        if(mat[row][mid]>left && mat[row][mid]>right) return new int[]{row,mid};
        else if(mat[row][mid]<left) hig=mid-1;
        else low=mid+1;
      } 
      return new int[]{-1,-1};
    }
}