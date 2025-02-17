class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String t="";
      for(String i :words){
             t+=i.charAt(0);
      }
      return t.equals(s);
    }
}