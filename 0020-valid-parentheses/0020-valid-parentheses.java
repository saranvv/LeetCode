class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if( !st.isEmpty() && ( c==')' || c==']' || c=='}')){
            if(c==']' && st.peek()=='[') st.pop();
           else if(c==')' && st.peek()=='(') st.pop();
            else if(c=='}' && st.peek()=='{') st.pop();
            else  st.push(c);
        }
        else{
            st.push(c);
        }
      }
      if(st.isEmpty()) return true;

      return false;
    }
}