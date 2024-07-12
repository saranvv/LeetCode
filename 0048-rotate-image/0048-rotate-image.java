class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix[0].length;
        
        
        int n=matrix.length;
        int[][] arr=new int[n][m];
        
        int x=-1;
        for(int i=0;i<n;i++){
             x++;
             int p=n;
            for(int j=0;j<m;j++){
                p--;
                  arr[i][j]=matrix[p][x];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=arr[i][j];
            }
        }

    }
}