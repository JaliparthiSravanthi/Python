class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
     int n=nums.length;
     int[] a=new int[n];
     int l=0;
     for(int i=0;i<n;i++){
        if(nums[i]<pivot){
            a[l]=nums[i];
            l++;
        }
     }
     for(int j=0;j<n;j++){
        if(nums[j]==pivot){
            a[l]=nums[j];
            l++;
        }
     }
     for(int k=0;k<n;k++){
      if(nums[k]>pivot){
        a[l]=nums[k];
        l++;
      }
     }
     for(int x=0;x<n;x++){
        nums[x]=a[x];
     }
    return nums;
    }
}