class Solution {
    public int reversePairs(int[] nums) {
        int n=nums.length-1;
        return MergeSort(nums,0,n);      
    }
    public static int MergeSort(int[] nums,int start,int end){
        if(start>=end) return 0 ;
        int mid=start+(end-start)/2;
        int c=0;
       c+= MergeSort( nums,start,mid);
        c+=MergeSort( nums,mid+1,end);
        c+=countpair(nums,start,mid,end);
        int[] temp=new int[end-start+1];
        Merge(nums,temp,start,mid,end,c);
        return c;
    }
    public static int countpair(int[] nums,int start,int mid,int end){
         int c=0;
         int right=mid+1;
         for(int left=start;left<=mid;left++){
            while(right<=end && (long)nums[left]>2L*nums[right]){
                 right++;
            }
            c+=right-(mid+1);
         }
    return c;
    }
    public static void Merge(int[] nums,int[] temp,int start,int mid,int end,int c){
        int left=start;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=end){
            if(nums[left]<=nums[right]){
                temp[k]=nums[left];
                left++;
            }
            else{
                temp[k]=nums[right];
                right++;
            }
            k++;
        } 
        while(left<=mid){
        temp[k]=nums[left];
        left++;
        k++;
    }
    while(right<=end){
        temp[k]=nums[right];
        right++;
        k++;
    }
    for(int i=start;i<=end;i++){
        nums[i]=temp[i-start];
    }
    }

}