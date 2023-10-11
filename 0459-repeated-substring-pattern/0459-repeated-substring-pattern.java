class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String Doubled=s+s;
        String sub=Doubled.substring(1,Doubled.length()-1);
        return sub.contains(s);
    }
}