class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
    HashMap<Integer,Integer> freq=new HashMap<>();
    freq.put(0,1);
    int sum=0;
    int c=0;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(freq.containsKey(sum-goal))
          c+=freq.get(sum-goal);
        freq.put(sum,freq.getOrDefault(sum,0)+1);
    }
    return c;
    }
}   