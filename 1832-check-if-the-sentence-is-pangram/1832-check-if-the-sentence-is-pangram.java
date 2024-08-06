class Solution {
    public boolean checkIfPangram(String s) {
        for(char i='a';i<='z';i++){
             boolean bool=false;
            for(char j=0;j<s.length();j++){
                if(i==s.charAt(j)) bool=true;
            }
            if(!bool) return false;
        }
        return true;
    }
}