class Solution {
    static Random rand = new Random();
    public int[] sortArray(int[] nums) {
        int n=nums.length;
      quickSort(nums,0,n-1);
      return nums;
    }
    public static void quickSort(int[] nums,int low,int high){
        if(low>=high) return;
        int randomindex=low+ rand.nextInt(high-low+1);
        int s=nums[low];
        nums[low]=nums[randomindex];
        nums[randomindex]=s;
        int index=f(nums,low,high);
        quickSort(nums,low,index-1);
        quickSort(nums,index+1,high);
    
    }
    public static int f(int[] nums,int low,int high){
           int pivot=low;
           int i=low;
           int j=high;
           while(i<j){
            while(i<=high && nums[i]<=nums[pivot]){
                i++;
            }
            while(j>=low && nums[j]>nums[pivot]){
                j--;
            }
            if(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;}
        }
        int t=nums[pivot];
        nums[pivot]=nums[j];
        nums[j]=t;
    return j;
    }
}
    