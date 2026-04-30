class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       
        int i=0;
        while(i<nums.length){
            int corr=nums[i]-1;
            if(nums[i]!=nums[corr]){
                int temp=nums[i];
                nums[i]=nums[corr];
                nums[corr]=temp;
            }
            else i++;
        }
        int k=0;
        List<Integer> list = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]-1){
              list.add(j+1);
            }
        }
        return list;
    }
}