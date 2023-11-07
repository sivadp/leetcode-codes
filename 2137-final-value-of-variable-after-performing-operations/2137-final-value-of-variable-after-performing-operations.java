class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res=0;
        for(String x:operations){
            res+=44-x.charAt(1);
        }
        return res;
    }
}