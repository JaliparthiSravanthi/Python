class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> list=new ArrayList<>();
      helper(0,0,candidates,target,new ArrayList<>(),list);
      return list;
        
    }
    public static void helper(int i,int sum,int[] a,int t,List<Integer> ds,List<List<Integer>> list){
        if(i==a.length){
            if(sum==t){
                list.add(new ArrayList<>(ds));
            }
            return;
        }
        if(sum+a[i]<=t){
            ds.add(a[i]);
            sum+=a[i];
            helper(i,sum,a,t,ds,list);
            ds.remove(ds.size()-1);
            sum-=a[i];
        }
        helper(i+1,sum,a,t,ds,list);
    }
}