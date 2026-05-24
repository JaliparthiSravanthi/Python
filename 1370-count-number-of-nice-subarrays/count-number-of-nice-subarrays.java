class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       HashMap<Integer,Integer> freq=new HashMap<>();
       freq.put(0,1);
       int sum=0;
       int c=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]%2!=0) sum+=1;
        if(freq.containsKey(sum-k)) c+=freq.get(sum-k);
        freq.put(sum,freq.getOrDefault(sum,0)+1);
       }
    return c;
    }
}