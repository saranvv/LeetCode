class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]!='.'){
                    char ch=board[i][j];
                    if(!solve(i,j,board,ch)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean solve(int row,int col,char[][] arr,char ch){
        for(int i=0;i<=8;i++){
            if(i!=row){
                if(arr[i][col]==ch) return false;
            }
        }
         for(int i=0;i<=8;i++){
            if(i!=col){
                if(arr[row][i]==ch) return false;
            }
        }
        int x=row/3 *3;
        int y=col/3 *3;
        for(int i=x;i<x+3;i++){
            for(int j=y;j<y+3;j++){
                if(i!=row && j!=col){
                    if(arr[i][j]==ch) return false;
                }
            }
        }
  return true;
    }
}