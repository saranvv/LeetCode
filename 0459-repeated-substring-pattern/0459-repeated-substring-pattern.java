class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String d=s+s;
        String m=d.substring(1,d.length()-1);
        return m.contains(s);
        
    }
}