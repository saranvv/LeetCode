class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=n-2;i>1;i--){
            if(!palindrome(n,i))
                return false;
        }
        return true;
    }

    public boolean palindrome(int num,int k){
       String s="";
       while(num>0){
        int t=num%k;
        num/=k;
        char c=(char)t;
        s+=c;
       }
       return isPalindrome(s);
    }

    public boolean isPalindrome(String s){
       int i=0,j=s.length()-1;
       while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
       }
       return true;
    }
}