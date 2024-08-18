class Solution {
    public int rob(int[] nums) {
         if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int x=0;
        int y=0;
        for(int n:nums){
            int c=Math.max(x,y+n);
            y=x;
            x=c;
        }
        return x;
    }
}