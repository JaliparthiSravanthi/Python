class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
         int c=0;
        int mcnt=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') c++;
            if(j-i+1==k){
                mcnt=Math.max(mcnt,c);
                char cha=s.charAt(i);
                 if(cha=='a' || cha=='e' || cha=='i' || cha=='o' || cha=='u') c--;
                i++;
            }
        }
    return mcnt;
    }
}   