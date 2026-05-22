class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> freq=new HashMap<>();
       freq.put(0,-1);
       int sum=0;
       int i=0;
       for(int x:nums){
        sum+=x;
        if(freq.containsKey(sum%k)){
            if(i-freq.get(sum%k)>=2) return true;
        }
        else
          freq.put(sum%k,i);
        i++;
       }
    return false;
    }
}