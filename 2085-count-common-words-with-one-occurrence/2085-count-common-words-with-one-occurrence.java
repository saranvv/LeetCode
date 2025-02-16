class Solution {
    public int countWords(String[] words1, String[] words2) {
         Map<String, Integer> m1= new HashMap<>();
          Map<String, Integer> m2= new HashMap<>();

        for(String i: words1){
          m1.put(i,m1.getOrDefault(i, 0) + 1);
        }
        for(String i: words2){
          m2.put(i,m2.getOrDefault(i, 0) + 1);
        }
        
        int count=0;

        for(String i:m1.keySet()){
          if(m1.get(i) == 1 && m2.containsKey(i) && m2.get(i) == 1){
            count++;
          }
        }

        return count;

    }
}