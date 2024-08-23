class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] arr=new int[n/2];
        int i=0;
        int j=n-1;
        while(i<j){
            arr[i]=nums[i]+nums[j];
            i++;
            j--;
        }
        int ans=0;
        for(int s=0;s<arr.length;s++){
             ans=Math.max(ans,arr[s]);
        }
         return ans;
    }
}