class Solution {
    public int maxVowels(String s, int k) {
        int vowels=0;
        int mvowels=0;
        for(int i=0;i<k;i++){
            char cha = s.charAt(i);
            if(cha==('a')||cha==('e')||cha==('i')||cha==('o')||cha==('u')){
                vowels++;
            }
           
        }
        mvowels=vowels;
        for(int j=k;j<s.length();j++){
            char ch = s.charAt(j-k);
            if(ch==('a')||ch==('e')||ch==('i')||ch==('o')||ch==('u')){
                vowels--;
            }
            char c=s.charAt(j);
             if(c==('a')||c==('e')||c==('i')||c==('o')||c==('u')){
                vowels++;
            }
            mvowels=Math.max(vowels,mvowels);
        }
        return mvowels;
    }
}