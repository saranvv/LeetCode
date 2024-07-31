class Solution {
    public String replaceDigits(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i)))
                     str+=s.charAt(i);
             else 
                str+=(char)(s.charAt(i-1)+s.charAt(i)-'0');
              
        }       
        return str;
    }
}