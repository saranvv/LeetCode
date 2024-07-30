class Solution {
    public int minOperations(int n) {
         int count=0;
        if (n%2==0) {
            count=(n/2)*(n/2);
        } 
        else{
            count=((n-1)/2)*((n+1)/2);
        }
        return count;
    }
}