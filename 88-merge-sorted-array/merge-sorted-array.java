class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] a=new int[n+m];
       int i=0;
       int j=0;
       int k=0;
       while(i<m && j<n){
        if(nums1[i]<=nums2[j]){
            a[k]=nums1[i];
            i++;
            k++;
        }
        else{
            a[k]=nums2[j];
            j++;
            k++;
        }    
       }
       while(i<m){
        a[k]=nums1[i];
        i++;
        k++;
       }
       while(j<n){
        a[k]=nums2[j];
        j++;
        k++;
       }
       for(int x = 0; x < m+n; x++){
    nums1[x] = a[x];
}

    System.out.println(nums1);
    }
}