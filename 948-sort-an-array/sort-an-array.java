class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
       Mergesort(nums,0,n-1);
       return nums; 
    }
    public static void Mergesort(int[] nums,int low,int high){
        if(low>=high) return;
        int mid=low+(high-low)/2;
        Mergesort(nums,low,mid);
        Mergesort(nums,mid+1,high);
        int[] temp=new int[high-low+1];
        Merge(nums,temp,low,mid,high);
    }
    public static void Merge(int[] a,int[] temp,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=high){
            if(a[left]<=a[right]){
                temp[k]=a[left];
                left++;
            }
            else{
                temp[k]=a[right];
                right++;
            }
            k++;
        }
        while(left<=mid){
            temp[k]=a[left];
            left++;
            k++;
        }
        while(right<=high){
            temp[k]=(a[right]);
            right++;
            k++;
        }
        for(int i=low;i<=high;i++){
        a[i]=temp[i-low];
    }
    }
}