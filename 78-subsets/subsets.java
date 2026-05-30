class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       helper(0,nums,new ArrayList<>(),ans);
       return ans;
    }
    public static void helper(int i,int[] a,List<Integer> ds,List<List<Integer>> ans){
        if(i==a.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(a[i]);
        helper(i+1,a,ds,ans);
        ds.remove(ds.size()-1);
        helper(i+1,a,ds,ans); 
    }
}