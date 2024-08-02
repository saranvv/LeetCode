class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int[] row=new int[n];
        int[] col=new int[n];
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<n;j++){
                if(max<grid[i][j]) max=grid[i][j];
            }
            row[i]=max;
        }
        for(int i=0;i<n;i++){
               int max=0;
            for(int j=0;j<n;j++){
                if(max<grid[j][i]) max=grid[j][i];
            }
            col[i]=max;
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               count+=Math.min(col[i],row[i])-grid[i][j];
            }
        }
        return count;
    }
}