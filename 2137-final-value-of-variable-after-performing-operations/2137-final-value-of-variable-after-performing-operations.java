class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res=0;
        for(String x:operations){
            if(x.equals("--X")||x.equals("X--")){
                res-=1;
            }
            else{
                res+=1;
            }
        }
        return res;
    }
}