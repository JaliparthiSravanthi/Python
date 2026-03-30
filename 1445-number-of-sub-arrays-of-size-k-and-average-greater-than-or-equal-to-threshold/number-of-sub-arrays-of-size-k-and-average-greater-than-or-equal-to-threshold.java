class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int sum=0;
       int c=0;
       float avg=0;
       for(int i=0;i<k;i++){
        sum+=arr[i];
       } 
       avg=(float)sum/k;
        if(avg>=threshold)
           c++;
       for(int j=k;j<arr.length;j++){
        sum=sum-arr[j-k]+arr[j];
        avg=(float)sum/k;
        if(avg>=threshold)
           c++;
       }
      return c; 
    }
}