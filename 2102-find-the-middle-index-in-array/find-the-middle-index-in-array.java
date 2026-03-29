class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            a[i]=sum;
        }
        for(int j=0;j<n;j++){
            if(j==0 && (a[n-1]-a[j])==0)
               return 0;
            else if(j>0 && a[j-1]==(a[n-1]-a[j]))
                 return j;
        }
        return -1;
    }
}