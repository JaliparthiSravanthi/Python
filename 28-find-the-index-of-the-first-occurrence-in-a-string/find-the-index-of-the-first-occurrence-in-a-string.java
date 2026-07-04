class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder str=new StringBuilder();
        int n=needle.length();
        int l=0;
        for(int i=0;i<haystack.length();i++){
            str.append(haystack.charAt(i));
            while(str.length()>n){
                str.deleteCharAt(0);
                l++;
            }
            if (str.toString().equals(needle)) return l;
        }
    return -1;
    }
}