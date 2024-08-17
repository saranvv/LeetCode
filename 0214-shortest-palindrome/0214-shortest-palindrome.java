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
            if (rev.startsWith(s.substring(i))) {
                l=s.length()-i;
                break;
            }
        }
        
        String ans=rev.substring(0,s.length()-l);
        return ans+s;
    }
}