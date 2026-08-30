class Solution {
    Stack<Character> st=new Stack<>();
    public String removeDuplicates(String s) {
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(!st.isEmpty() && st.peek()==ch) st.pop();
        else st.push(ch);
       } 
       StringBuilder ans=new StringBuilder();
       while(!st.isEmpty()){
        ans.append(st.pop());
       }
    return ans.reverse().toString();
    }
}