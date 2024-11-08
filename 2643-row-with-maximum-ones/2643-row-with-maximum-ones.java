class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
      
        int max=0;
        int[] ans=new int[2];
        for(int i=0;i<mat.length;i++){
              int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) count++;
            }
           if(count>max){
            max=count;
            ans[0]=i;
            ans[1]=count;
           }
        }
        return ans;
    }
}