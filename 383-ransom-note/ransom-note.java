class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int j=0;j<magazine.length();j++){
            if(map.containsKey(magazine.charAt(j))){
                map.put(magazine.charAt(j),map.get(magazine.charAt(j))-1);
                if(map.get(magazine.charAt(j))==0) map.remove(magazine.charAt(j));
            }
          
           

     }
    return map.isEmpty();
    }
}