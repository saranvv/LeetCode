class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=nums.length;
        ArrayList arr=new ArrayList();

        for(int i=0;i<n-1;i+=2){
            int x=nums[i];
            while(x>0){
                arr.add(nums[i+1]);
                x--;
            }
        }
        int[] ans=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
             ans[i]=(int) arr.get(i);
        }
        return ans;
    }
}