class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       HashSet<List<Integer>> set=new HashSet<>();
       
       int a=nums.length;
       int n=1<<a;
       for(int i=0;i<n;i++){
        List<Integer> sub=new ArrayList<>();
        for(int j=0;j<a;j++){
            if((i&(1<<j))!=0) sub.add(nums[j]);
        }
        set.add(sub);
       } 
    return new ArrayList<>(set);
    }
}