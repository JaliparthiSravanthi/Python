class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       HashMap<Integer,Integer> freq=new HashMap<>();
       freq.put(0,1);
       int sum=0;
       int c=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        int rem=((sum%k)+k)%k;
        if(freq.containsKey(rem)){
          c+=freq.get(rem);
        }
        freq.put(rem,freq.getOrDefault(rem,0)+1);
       }
    return c; 
    }
}