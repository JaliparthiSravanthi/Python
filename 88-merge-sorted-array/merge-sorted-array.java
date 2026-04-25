class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=m;
       for(int i=0;i<nums2.length;i++){
        nums1[j]=nums2[i];
        j++;
       } 
       for(int k=0;k<nums1.length;k++){
       for(int l=k+1;l<nums1.length;l++){
        if(nums1[k]>nums1[l]){
            int temp=nums1[k];
            nums1[k]=nums1[l];
            nums1[l]=temp;
        }
        
       }
       }
       System.out.println(nums1);
    }
}