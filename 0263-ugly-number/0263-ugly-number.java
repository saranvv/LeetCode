class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        while(n!=1){
            if(n%2!=0 && n%3!=0 && n%5!=0 && n%6!=0 && n%10!=0 && n%15!=0){
                return false;
            }
            if(n%2==0){
                n=n/2;
            }
            else if(n%3==0){
                n=n/3;
            }
            else if(n%5==0){
                n=n/5;
            }
        }
        return true;
    }
}