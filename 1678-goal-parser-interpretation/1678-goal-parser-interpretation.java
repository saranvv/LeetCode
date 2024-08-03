class Solution {
    public String interpret(String c) {
        String str="";
        int x=c.indexOf("()");
        for(int i=0;i<c.length();i++){
            if(c.charAt(i)=='('&&c.charAt(i+1)==')')
                         str+="o";
            else  if(c.charAt(i)!='('&&c.charAt(i)!=')'){
                 str+=c.charAt(i);
            }
        }
        return str;
    }
}