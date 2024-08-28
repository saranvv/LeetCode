class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==']'){
                String str="";
               while(st.peek()!='['){
                   str=st.pop()+str;
               }
               st.pop();
               String num="";
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                     num=st.pop()+num;
                }
               
               int n=Integer.parseInt(num);
               String temp=str.repeat(n);
               for(char x : temp.toCharArray()){
                 st.push(x);
               }

            }
            else{
               st.push(c);
            }
           
        }
        String ans="";
        for(char i:st){
            ans+=i;
        }
        return ans;
    }
}