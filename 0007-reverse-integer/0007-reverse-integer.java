class Solution {
    public int reverse(int x) {
        int result=0;
        while(x!=0){
            int digit=x%10;
        if(result>Integer.MAX_VALUE/10||result==Integer.MAX_VALUE&&digit>7){
            return 0;
        }
        if(result<Integer.MIN_VALUE/10||result==Integer.MIN_VALUE&&digit<8){
            return 0;
        }
        result=result*10+digit;
        x/=10;
        }
        return result;
    }
}