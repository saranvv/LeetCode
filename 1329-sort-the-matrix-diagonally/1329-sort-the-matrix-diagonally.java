class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        for (int i=0;i<m;i++){
             solve(mat,i,0,m,n);
         }
        for (int j=1;j<n;j++) {
            solve(mat,0,j,m,n);
        }
        return mat;
    }

    public void solve(int[][] mat,int i,int j,int m,int n) {

        List<Integer> li=new ArrayList<>();
        int x=i;
        int y=j;
        while (x<m && y<n)
        {
             li.add(mat[x++][y++]);
        }    
        Collections.sort(li);
        x=i;
        y=j;
        int t= 0;
        while (x<m && y<n) {
            mat[x++][y++]=li.get(t++);
        }
    }
}