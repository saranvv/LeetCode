class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int i = 0;
        int j = 0;
        while (i < nums.length) {

            if (nums[i] == target) {
                ans[j] = i;
                j = 1;
            }
            i++;
        }
        if (ans[0] != -1 && ans[1] == -1) {
            ans[1] = ans[0];
        }
        return ans;
    }
}