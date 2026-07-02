class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        int n=arr.length-1;
        String str=arr[n];
        return str.length();
    }
}