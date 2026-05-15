class Solution {

    public int atMost(int[] nums, int goal) {
        if(goal < 0) return 0;

        int l = 0;
        int sum = 0;
        int c = 0;

        for(int i = 0; i < nums.length; i++) {

            sum += nums[i];

            while(sum > goal) {
                sum -= nums[l];
                l++;
            }

            c += i - l + 1;
        }

        return c;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
}