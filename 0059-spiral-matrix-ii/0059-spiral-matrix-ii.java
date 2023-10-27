class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int left=0,right=n-1,bottom=n-1,top=0,count=1;
        while(left<=right&&top<=bottom){
            for(int i=top,j=left;j<=right;j++){
                res[i][j]=count;
                count++;
            }
            top++;
            for(int i=top,j=right;i<=bottom;i++){
                res[i][j]=count;
                count++;
            }
            right--;
            for(int i=bottom,j=right;j>=left;j--){
                res[i][j]=count;
                count++;
            }
            bottom--;
            for(int i=bottom,j=left;i>=top;i--){
                res[i][j]=count;
                count++;
            }
            left++;
        }
        return res;
    }
}