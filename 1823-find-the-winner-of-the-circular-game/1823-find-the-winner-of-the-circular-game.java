class Solution {
    public int findTheWinner(int n, int k) {
       List<Integer> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            li.add(i);
        }
        while(li.size()>1){
         while(li.size()<=k){
            k-=li.size();
        }
        for(int i=0;i<li.size();i+=k){
            li.remove(k);
        }
        k--;
        }
        return li.get(0);
    }
  
}