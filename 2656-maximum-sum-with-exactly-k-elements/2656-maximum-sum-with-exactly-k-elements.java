class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
       int t=nums[nums.length-1];
       int ans=0;
       while(k!=0){
     ans+=t;
     t+=1;
     k--;
       }
       return ans;
    }
}