class Solution {
    public int minOperations(String[] logs) {
        int i=0;
        for (String s:logs) {
            if (s.equals("../")) {
                if (i>0) {
                    i--;
                }
            } else if(!s.equals("./")) {
                i++;
            }
        }
        return i;
    }
}