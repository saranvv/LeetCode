class Solution {
    public int diagonalSum(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length-1;
        int sum=0;
        for(int i=0;i<m;i++){
              sum+=mat[i][i];
              sum+=mat[i][n--];
        }
          if (m%2!=0) {
            sum-=mat[m/2][m/2];
        }
      return sum;
    }
}