class Solution {
    public int fib(int n) {
        if(n==0)return 0;
        int a=0;
        int b=1;
        int count=3;
        int sum=0;
        while(count<=n){
            sum=a+b;
            a=b;
            b=sum;
            count++;
        }
        return a+b;
    }
}