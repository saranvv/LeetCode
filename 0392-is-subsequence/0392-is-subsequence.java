class Solution {
    public boolean isSubsequence(String s, String t) {
        int x=-1;
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
            if(s.charAt(i)==t.charAt(j) && j>x){
                count++;
                x=j;
                break;
            }
            }
        }
            if(count==s.length()) return true;
            return false;

    }
}