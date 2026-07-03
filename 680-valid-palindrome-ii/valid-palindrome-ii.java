class Solution {
    public boolean validPalindrome(String s) {
        int c=0;
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return ispalindrome(s,i+1,j) || ispalindrome(s,i,j-1);
            }
            i++;
            j--;
        }
    return true;
    }
    public static Boolean ispalindrome(String str,int i,int j){
        while(i<j){
        if(str.charAt(i)!=str.charAt(j)) return false;
        i++;
        j--;
        }

    return true;
    }
}