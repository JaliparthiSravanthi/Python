class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int tsum=0;
        for(int i=0;i<arr.length;i++){
             int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                int len=j-i+1;
                if(len%2!=0){
                    tsum+=sum;
                }
            }
           
        }
        return tsum;
    }
}