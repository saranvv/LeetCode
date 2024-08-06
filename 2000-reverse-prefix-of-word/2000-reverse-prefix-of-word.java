class Solution {
    public String reversePrefix(String word, char ch) {
        String str="";
        int k=word.indexOf(ch);
        if(k!=-1){
        for(int i=0;i<=k;i++){
            str=word.charAt(i)+str;
        }
        for(int i=k+1;i<word.length();i++){
            str+=word.charAt(i);
        }
        return str;
    }
    return word;
    }
}