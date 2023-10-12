class Solution {
    public int reverse(int x) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        String str=String.valueOf(x);
        StringBuilder strbul=new StringBuilder();
        if(str.charAt(0)=='-'){
        strbul=new StringBuilder(str.substring(1)).reverse();
        strbul.insert(0,"-");
        }
        else{
        strbul=new StringBuilder(str).reverse();
        }
        try{
        int revInt=Integer.parseInt(strbul.toString());
        return revInt;
        }
        catch(Exception e){
            return 0;
        }
    }
}