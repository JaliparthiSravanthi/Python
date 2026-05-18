class Solution {
    public int largestAltitude(int[] gain) {
       int n=gain.length;
       int[] a=new int[n+1];
       a[0]=0;
       for(int i=1;i<a.length;i++){
        a[i]=a[i-1]+gain[i-1];
       } 
       int max=a[0];
       for(int j=0;j<a.length;j++){
        if(a[j]>max) max=a[j];
       }
    return max;
    }
}