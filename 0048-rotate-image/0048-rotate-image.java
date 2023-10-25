class Solution {
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0,k=len-1;j<len/2;j++,k--){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
            }
        }
    }
}