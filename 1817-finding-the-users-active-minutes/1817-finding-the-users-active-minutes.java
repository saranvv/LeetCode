class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
          Map<Integer,Set<Integer> > mp=new HashMap<>();
          for(int[] i : logs){
            int a=i[0];
            int b=i[1];
            if(!mp.containsKey(a)){
                mp.put(a,new HashSet<Integer>());
            }
            mp.get(a).add(b);
          }
          int[] arr=new int[k];
          for(Set<Integer> i : mp.values()){
            int t=i.size();
            arr[t-1]++;
          }
  return arr;
    }
}