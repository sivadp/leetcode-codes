class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        Set<Integer> rows=new HashSet<>();
        Set<Integer> cols=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int a:rows){
            for(int i=0;i<n;i++){
                matrix[a][i]=0;
            }
        }
        for(int a:cols){
            for(int i=0;i<m;i++){
                matrix[i][a]=0;
            }
        }
    }
}