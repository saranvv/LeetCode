class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1;
        int sum=0;
        while(n!=0){
            int mod=n%10;
            sum+=mod;
            pro*=mod;
            n/=10;
        }
        return pro-sum;
    }
}