class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Stack<Integer> st=new Stack<>();
    int[] num=new int[nums2.length];
    for(int i=nums2.length-1;i>=0;i--){
        if(i==nums2.length-1){
            num[i]=-1;
            st.push(nums2[i]);
        }
        else{
            while(!st.isEmpty()){
                if(nums2[i]<st.peek()){ 
                    num[i]=st.peek();
                    break;
                }
                else st.pop();
            }
            if(st.isEmpty()) num[i]=-1;
            st.push(nums2[i]);
        }
    }
    int[] num3=new int[nums1.length];
    for(int j=0;j<nums1.length;j++){
        for(int k=0;k<nums2.length;k++){
            if(nums1[j]==nums2[k]) {
                num3[j]=num[k];
                break;
            }

        }
    }
    return num3;    }
}