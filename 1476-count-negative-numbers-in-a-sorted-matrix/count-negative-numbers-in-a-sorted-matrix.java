class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        int n=grid[0].length;
        for(int i=0;i<grid.length;i++){
            int l=0;
            int r=n-1;
            int firstnegative =n;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(grid[i][mid]<0){
                    firstnegative=mid;
                    r=mid-1;
                }
                else
                   l=mid+1;
            }
            c+=(n-firstnegative);
        }
        return c;
    }
}