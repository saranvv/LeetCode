class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
           mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        int max=0;
        int count=0;
        for(int i : mp.values()){
            max=Math.max(max,i);
        }
        for(int i:mp.values()){
            if(max==i) count++;
        }
        return count*max;
    }
}