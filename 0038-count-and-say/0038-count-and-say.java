class Solution {
    public String countAndSay(int n) {
        StringBuilder str=new StringBuilder();
        str.append("1");
        for(int i=1;i<n;i++){
            int count=1;
            StringBuilder prestr=new StringBuilder();
            for(int j=0;j<str.length();j++){
                if(j+1<str.length()&&str.charAt(j)==str.charAt(j+1)){
                    count++;
                }
                else{
                    prestr.append(String.valueOf(count));
                    prestr.append(str.charAt(j));
                    count=1;
                }
            }
            str=prestr;
        }
        return str.toString();
    }
}