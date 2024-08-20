class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int l=f.length;
        if(l<2){
            if(f[0]==0 && n<=1 || (f[0]==1 && n==0 )) return true;
            return false;
        }

        if(f[0]==0 && f[1]==0) {
            f[0]=1;
            n--;
        }
        if(f[l-1]==0 && f[l-2]==0){
            f[l-1]=1;
            n--;
        }
        for(int i=1;i<l-1;i++){
            if(f[i]==0 ){
                     if(f[i-1]==0 && f[i+1]==0){
                        f[i]=1;
                        n--;
                     }
            }
        }
        if(n<=0) return true;
        return false;
    }
}