class Solution {
    public int pivotInteger(int n) {
      int[] a=new int[n];
      int sum=0;
      for(int i=0;i<n;i++){
         sum+=i+1;
         a[i]=sum;
      } 
      for(int j=0;j<n;j++){
        if(j==0 && a[n-1]-a[0]==0) return 1;
        else if(j!=0 && a[j]==a[n-1]-a[j-1]) return j+1;
      } 
    return -1;
    }
}