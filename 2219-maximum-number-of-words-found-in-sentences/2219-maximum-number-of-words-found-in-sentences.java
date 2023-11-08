class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String a:sentences){
            max=Math.max(a.split(" ").length,max);
        }
        return max;
    }
}