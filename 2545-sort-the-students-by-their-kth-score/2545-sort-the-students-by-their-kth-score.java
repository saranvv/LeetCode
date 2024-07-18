class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
      int m=score.length;
      int n=score[0].length;
      int x=k;
     
      for(int i=0;i<m-1;i++){
        for(int t=0;t<m-1-i;t++){
         if(score[t][x]<score[t+1][x]){

           
        for(int j=0;j<n;j++){
           int temp=score[t][j];
           score[t][j]=score[t+1][j];
           score[t+1][j]=temp;
        }
      }
        }
      
    }
    return score;
    }
}