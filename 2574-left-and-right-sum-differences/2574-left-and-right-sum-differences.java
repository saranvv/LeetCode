class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int ans[]=new int[n];
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            if(i==0){
            arr1[i]=0;
            }
            else{
                sum1=sum1+nums[i-1];
                arr1[i]=sum1;
            }}

            for(int i=0;i<n;i++){
                if(i==n-1){
                arr2[n-1]=0;
                }else{
                    sum2=0;
                for(int j=i+1;j<n;j++){
                    sum2=sum2+nums[j];
                }
                arr2[i]=sum2;
                }
            }
            for(int i=0;i<n;i++){
                int p=Math.abs(arr1[i]-arr2[i]);
                ans[i]=p;
            }
            return ans;
            
        
        
    }
}