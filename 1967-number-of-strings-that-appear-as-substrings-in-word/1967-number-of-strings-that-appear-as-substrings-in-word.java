class Solution {
    public int numOfStrings(String[] p, String word) {
        int count=0;
        for(int i=0;i<p.length;i++){
            if(word.contains(p[i])) count++;
        }
        return count;
    }
}