class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> count=new HashMap<>();
        count.put(0,-1);
        int sum=0;
        int mlen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) sum+=-1;
            else sum+=1;
            if (count.containsKey(sum)){
                mlen=Math.max(mlen,i-count.get(sum));
            }
            else
              count.put(sum,i);
        }
    return mlen;
    }
}