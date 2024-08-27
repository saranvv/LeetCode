class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int two=0;
        int one=0;
        for(int i=0;i<n;i++){
            if(nums[i]>9) two+=nums[i];
            else one+=nums[i];
        }
        if(two==one) return false;
        return true;
    }
}