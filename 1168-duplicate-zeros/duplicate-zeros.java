class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
       int[] a=new int[n];
       int k=0;
       for(int i=0;i<n && k<n;i++){
        
        if(arr[i]==0){
            a[k]=0;
            if(k<n){
              a[k++]=0;
            }
        }
        else{
           a[k]=arr[i];}
        k++;
       } 
     for(int i=0;i<n;i++){
        arr[i]=a[i];
     }
     System.out.println(Arrays.toString(a));
    }
}