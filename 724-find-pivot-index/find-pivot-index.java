class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        int sum=0;
      for(int i=0;i<n;i++){
         sum+=nums[i];
         a[i]=sum;
      }  
      for(int j=0;j<n;j++){
        if(j==0 && (a[n-1]-a[0])==0) return 0;
        else if(j==n-1 && a[j-1]==0) return n-1;
        else if(j!=0 && a[j]==(a[n-1]-a[j-1])) return j;  
        }
    return -1;
    }
}