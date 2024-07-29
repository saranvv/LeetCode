class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int k=0;
        int f=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0) pos[k++]=nums[i];
            else neg[f++]=nums[i]; 
        }
        int p=0;
        for(int i=0;i<n/2;i++){
                 nums[p++]=pos[i];
                 nums[p++]=neg[i];
        }
        return nums;
    }
}