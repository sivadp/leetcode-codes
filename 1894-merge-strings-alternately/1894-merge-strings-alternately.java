class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] word3=word1.toCharArray();
        char[] word4=word2.toCharArray();
        int length1=word3.length;
        int length2=word4.length;
        StringBuilder newWord=new StringBuilder();
        for(int i=0;i<length1+length2;i++){
           if(i<length1){
               newWord.append(word3[i]);
           }
           if(i<length2){
               newWord.append(word4[i]);
           }
        }
        return newWord.toString();
    }
}