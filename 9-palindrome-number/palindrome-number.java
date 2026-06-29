class Solution {
    public boolean isPalindrome(int x) {
    if(x<0 || (x%10==0 && x!=0)) return false;
    int val=0;
    while(x>val){
        val=val*10+x%10;
        x=x/10;
    }
    return (x==val|| x==val/10)?true:false; 
    }
}