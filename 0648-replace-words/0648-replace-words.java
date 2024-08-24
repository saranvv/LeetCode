class Solution {
    public String replaceWords(List<String> d, String sentence) {
       String[] word=sentence.split(" ");
        for (int i = 0;i<d.size(); i++) {
            for (int j = 0;j<word.length; j++) {
                if (word[j].startsWith(d.get(i))) {
                    word[j]=d.get(i);
        
                }
            }
        }
        String ans="";
        for(String s : word){
            ans+= s+" ";
        }
        return ans.trim();
    }
}