class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res=new ArrayList<>();
        res.add(0);
        res.add(1);
        if(n==1){
            return res;
        }
        int pow=1;
        while(n!=1){
            List<Integer> curlist=new ArrayList<>();
            int len=res.size();
            while(len>=1){
                curlist.add(res.get(len-1)+(int)Math.pow(2,pow));
                len--;
            }
            res.addAll(curlist);
            n--;
            pow++;
        }
        return res;
    }
}