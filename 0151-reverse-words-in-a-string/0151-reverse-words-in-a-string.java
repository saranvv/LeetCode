class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split("\\s+");
        String ans="";
        for(String i : arr){
           
            ans=i+" "+ans;
        }
        return ans.trim();
    }
}