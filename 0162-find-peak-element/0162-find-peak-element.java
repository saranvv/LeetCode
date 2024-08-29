class Solution {
    public int findPeakElement(int[] nums) {
        int ans=nums[0];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>ans){
                ans=nums[i];
                k=i;
            }
            }
        return k;
    }
}