class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        double sum=0;
        int i=0;
        int j=n-1;
        double ans=100000;
        for(int s=0;s<n/2;s++){
            sum=(nums[i++]+nums[j--])/2.0;
            if(sum<ans) ans=sum;
        }
        return ans;
    }
}