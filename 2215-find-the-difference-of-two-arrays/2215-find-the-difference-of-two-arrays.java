class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         List<Integer> l1=new ArrayList<>();
       List<Integer> l2=new ArrayList<>();
      Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for (int a:nums1){
            s1.add(a);
        }
        for (int b:nums2){
            s2.add(b);
        }
        for (Integer a:s1){
            if (!s2.contains(a)){
                l1.add(a);
            }
        }
        for (Integer b:s2){
            if (!s1.contains(b)){
                l2.add(b);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}