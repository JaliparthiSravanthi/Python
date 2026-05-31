class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> list=new ArrayList<>();
      helper(0,candidates,target,new ArrayList<>(),list);
      return list;
        
    }
    public static void helper(int i,int[] a,int t,List<Integer> ds,List<List<Integer>> list){
        if(i==a.length){
            if(t==0){
                list.add(new ArrayList<>(ds));
            }
            return;
        }
        if(a[i]<=t){
            ds.add(a[i]);
            helper(i,a,t-a[i],ds,list);
            ds.remove(ds.size()-1);
        }
        helper(i+1,a,t,ds,list);
    }
}