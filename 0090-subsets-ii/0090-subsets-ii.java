class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
          List<List<Integer>> result = new ArrayList<>();
        generateSubsets(result, new ArrayList<>(), nums, 0);
        return result;
    }
     private static void generateSubsets(List<List<Integer>> result, List<Integer> current, int[] nums, int index) {
        if (index == nums.length) {
            if(!result.contains(new ArrayList<>(current)))
                  result.add(new ArrayList<>(current));
            return;
        
        }
        current.add(nums[index]);
        generateSubsets(result, current, nums,index + 1);
        current.remove(current.size() - 1);
        generateSubsets(result,current, nums,index + 1);
    }
}
