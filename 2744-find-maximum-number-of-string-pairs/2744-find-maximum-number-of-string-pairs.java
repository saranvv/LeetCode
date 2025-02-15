class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
         List<String> li =new ArrayList<>();
        int count=0;
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder(words[i]);
            if(li.contains(sb.reverse().toString())){
                count++;
            }else{
                li.add(words[i]);
            }
        }
        return count;  
    }
}