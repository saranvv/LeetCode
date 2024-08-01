class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                str+=Character.toLowerCase(c);
                    }
        }
                    StringBuilder sb=new StringBuilder(str);
                    sb.reverse();
                    if(str.equals(sb.toString()))return true;
                    return false;
    }
}