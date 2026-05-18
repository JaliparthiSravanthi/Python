class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
     int sum=0;
     for(int i=0;i<n;i++){
        sum+=nums[i];
        nums[i]=sum;
    } 
    for(int j=0;j<n;j++){
        if(j==0 &&(nums[n-1]-nums[j])==0) return 0;
        //else if(j==n-1 && nums[j-1]==0 ) return j;
        else if(j!=0 && nums[j]==nums[n-1]-nums[j-1]) return j;
    }
    return -1;
    }
}