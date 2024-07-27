class Solution {
    public int mostWordsFound(String[] s) {
        int sum=0;
      for(int i=0;i<s.length;i++){
        String[] arr=s[i].split(" ");
        sum=Math.max(sum,arr.length);
      }
      return sum;
    }
}