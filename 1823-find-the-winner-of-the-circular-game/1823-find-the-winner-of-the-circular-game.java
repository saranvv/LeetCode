class Solution {
    public int findTheWinner(int n, int k) {
       List<Integer> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            li.add(i);
        }
        while(li.size()>1){
         int i=0;
        while (li.size()>1) {
            i=(i+k-1)%li.size();
            li.remove(i);
        }
        }
        return li.get(0);
    }
  
}