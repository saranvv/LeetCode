class Solution {
    public int triangularSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                nums[j]=(nums[j]+nums[j+1])%10;
            }
        }
        return nums[0];
    }
}