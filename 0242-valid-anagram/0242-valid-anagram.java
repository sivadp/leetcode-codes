class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> Set1=new HashMap<>();
        Map<Character,Integer> Set2=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(Set1.containsKey(c1)){
                Set1.put(c1,Set1.get(c1)+1);
            }
            else{
                Set1.put(c1,1);
            }
            if(Set2.containsKey(c2)){
                Set2.put(c2,Set2.get(c2)+1);
            }
            else{
                Set2.put(c2,1);
            }
        }
        return Set1.equals(Set2);
    }
}