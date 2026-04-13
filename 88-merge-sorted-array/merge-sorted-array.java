class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
          nums1[m+i]=nums2[i];
        }
       for(int i = 1; i < m + n; i++){
            for(int k=i;k>0;k--){
                if(nums1[k]<nums1[k-1]){
                int temp = nums1[k-1];
                nums1[k-1] = nums1[k];
                nums1[k] = temp;}
                else break;
                
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}