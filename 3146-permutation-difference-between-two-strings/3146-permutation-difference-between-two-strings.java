class Solution {
    public int findPermutationDifference(String s, String t) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int x=t.indexOf(s.charAt(i));
            count+=Math.abs(i-x);
        }
        return count;
    }
}