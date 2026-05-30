class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int a=nums.length;
        int n=1<<a;
        for(int i=0;i<n;i++){
            List<Integer> sub =new ArrayList<>();
            for(int j=0;j<a;j++){
                if((i&(1<<j))!=0) sub.add(nums[j]);
            }
            ans.add(sub);
        }
    return ans;
    }
}