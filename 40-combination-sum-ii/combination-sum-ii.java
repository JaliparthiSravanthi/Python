class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> set =new HashSet<>();
        Arrays.sort(candidates);
        helper(0,candidates,target,new ArrayList<>(),set);
        return new ArrayList<>(set);

    }
    public static void helper(int ind,int[] a,int t,List<Integer> ds,HashSet<List<Integer>> set){
        if(t==0){
            set.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<a.length;i++ ){
            if(i>ind && a[i]==a[i-1]) continue;
            if(a[i]>t) break;
            ds.add(a[i]);
            helper(i+1,a,t-a[i],ds,set);
            ds.remove(ds.size()-1);
        }
    }
}