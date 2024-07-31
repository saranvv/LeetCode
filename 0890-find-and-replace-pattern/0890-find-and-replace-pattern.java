class Solution {
    public List<String> findAndReplacePattern(String[] words, String p) {
    List<String> list=new ArrayList<>();
        for(String str:words) {
            if(find(str,p))list.add(str);
        }
        return list;
    }
    
   public  boolean find(String a,String b) {
        for(int i=0;i<a.length();i++) {
         if(a.indexOf(a.charAt(i))!=b.indexOf(b.charAt(i))){
            return false;
         }
        }
        return true;
         }
   }