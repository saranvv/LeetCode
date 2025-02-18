class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
           int[][] arr=new int[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
               int onesRow = 0, onesCol = 0, zerosRow = 0, zerosCol = 0;
                for (int k = 0; k < n; k++) {
                    if (grid[i][k] == 1) onesRow++;
                    else zerosRow++;
                }
                for (int k = 0; k < m; k++) {
                    if (grid[k][j] == 1) onesCol++;
                    else zerosCol++;
                }
              arr[i][j] = onesRow + onesCol - zerosRow - zerosCol;
            }
        }
        return arr;
    }
}