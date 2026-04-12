class Solution {
    int count(int[][] arr,int val){
        int r=0;
        int c=arr[0].length-1;
        int cnt=0;
        while(r<arr.length && c>=0){
           
            if(arr[r][c]<=val){
                cnt+=(c+1);
                r++;
            }
            else c--;
        }
    return cnt;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];
        while(low<high){
            int mid=low+(high-low)/2;
            int c=count(matrix,mid);
            if(c<k) low=mid+1;
            else   high=mid;
        }
    return low;
    }
}