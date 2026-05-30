class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      HashSet<List<Integer>> set=new HashSet<>();
      Arrays.sort(nums);
      helper(0,nums,new ArrayList<>(),set);
      return new ArrayList<>(set);
    }
    public static void helper(int i,int[] nums,List<Integer> ds,HashSet<List<Integer>> set){
        if(i==nums.length){
            set.add(new ArrayList<>(ds));
            return ;
        }
        ds.add(nums[i]);
        helper(i+1,nums,ds,set);
        ds.remove(ds.size()-1);
        helper(i+1,nums,ds,set);
    }
}