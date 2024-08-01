class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')){
                str+=s.charAt(i);
                    }
        }
        str.toLowerCase();
                    StringBuilder sb=new StringBuilder(str);
                    sb.reverse().toString();
                    if(str.equals(sb)) return true;
                    return false;
    }
}