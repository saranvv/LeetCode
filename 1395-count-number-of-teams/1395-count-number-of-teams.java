class Solution {
    public int numTeams(int[] r) {
        int count=0;
        for(int i=0;i<r.length-2;i++){
            for(int j=i+1;j<r.length-1;j++){
                       for(int k=j+1;k<r.length;k++){
                        if((r[i]<r[j])&&(r[j]<r[k])) count++;
                        if((r[i]>r[j])&&(r[j]>r[k])) count++;
                       }
            }
        }
        return  count;
    }
}