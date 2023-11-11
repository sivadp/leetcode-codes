class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(Arrays.asList(1));
        for(int i=1;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
               int one=(j==0)?0:res.get(i-1).get(j-1);
               int two=(j==i)?0:res.get(i-1).get(j);
               row.add(one+two);
            }
            res.add(row);
        }
        return res;
    }
}