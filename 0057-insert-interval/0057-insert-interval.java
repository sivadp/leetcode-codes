class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] int2=new int[intervals.length+1][2];
        System.arraycopy(intervals,0,int2,0,intervals.length);
        int2[int2.length-1][0]=newInterval[0];
        int2[int2.length-1][1]=newInterval[1];
        Arrays.sort(int2,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<int2.length;i++){
            if(result.size()==0||result.get(result.size()-1).get(1)<int2[i][0]){
                result.add(Arrays.asList(int2[i][0],int2[i][1]));
            }
            else{
                result.set(result.size()-1,Arrays.asList(result.get(result.size()-1).get(0),Math.max(result.get(result.size()-1).get(1),int2[i][1])));
            }
        }
        int[][] res=new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            res[i][0]=result.get(i).get(0);
            res[i][1]=result.get(i).get(1);
        }
        return res;
    }
}