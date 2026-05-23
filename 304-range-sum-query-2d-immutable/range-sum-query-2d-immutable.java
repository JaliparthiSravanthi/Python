class NumMatrix {
    int[][] a;
    public NumMatrix(int[][] matrix) {
        a=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(i==0 && j==0)
                a[i][j]=matrix[i][j];
                else if(i==0 && j!=0)
                  a[i][j]=matrix[i][j]+a[i][j-1];
                else if(j==0 && i!=0)
                  a[i][j]=matrix[i][j]+a[i-1][j];
                if(i!=0 && j!=0)
                 a[i][j]=matrix[i][j]+a[i-1][j]+a[i][j-1]-a[i-1][j-1];
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = a[row2][col2];

        int top = (row1 > 0) ? a[row1 - 1][col2] : 0;
        int left = (col1 > 0) ? a[row2][col1 - 1] : 0;
        int overlap = (row1 > 0 && col1 > 0) ? a[row1 - 1][col1 - 1] : 0;

        return total - top - left + overlap;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */