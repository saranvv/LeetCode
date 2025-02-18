class Solution {
    public List<List<Integer>> groupThePeople(int[] s) {
       List<List<Integer>> result = new ArrayList<>();
         for (int i = 0; i < s.length; i++) {
             if (s[i]==-1) continue; 
            List<Integer> group = new ArrayList<>();
            int groupSize=s[i];
            for (int j=i;j<s.length; j++) {
                if (s[j] == groupSize) {
                    group.add(j);
                    s[j] = -1;
                }
                if (group.size() == groupSize) break;
            }

            result.add(group);
        }
        return result;
      
    }
    }