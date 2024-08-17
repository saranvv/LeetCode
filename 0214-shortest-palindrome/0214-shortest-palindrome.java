class Solution {
    public String shortestPalindrome(String s) {
         Stack<Character> st=new Stack<>();
        for (char c:s.toCharArray()) {
            st.push(c);
        }
        
        StringBuilder sb= new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        String rev =sb.toString();
          int l=0;
        for (int i = 0;i<s.length();i++) {
            if (s.startsWith(rev.substring(i))) {
                l=i;
                break;
            }
        }
        
        String ans=rev.substring(0,l);
        return ans+s;
    }
}