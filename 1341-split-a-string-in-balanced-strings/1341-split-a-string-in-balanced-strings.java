class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int rcnt=0,lcnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='R')rcnt++;
            else lcnt++;
            if(rcnt==lcnt){
                count++;
                rcnt=lcnt=0;
            }
        }
        return count;
    }
}