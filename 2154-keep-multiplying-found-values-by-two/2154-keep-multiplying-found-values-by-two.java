class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int x=original;
             for(int i=0;i<nums.length;i++){
                
            if(nums[i]==x){
                x*=2;


            }
             }
           
        return x;
    }
}