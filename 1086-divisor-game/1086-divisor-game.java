/*class Solution {
    public boolean divisorGame(int n) {
        if(n==1)return false;
        int count=0;
        while(n!=0){
            int x=n/2;
            int prev=count;
            while(x>0&&x<n){
                if(n%x==0){
                    count++;
                    n=n-x;
                    break;
                }else{
                x--;
                }
            }
            if(prev==count){
                break;
            }
        }
        return (count%2==0)?true:false;
    }
}*/
class Solution {
    public boolean divisorGame(int n) {
        return n % 2 == 0;
    }
}
