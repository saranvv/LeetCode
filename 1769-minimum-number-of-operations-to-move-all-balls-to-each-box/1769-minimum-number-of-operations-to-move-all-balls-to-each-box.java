class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        char[] arr=boxes.toCharArray();
        int[] ans=new int[n];
        
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                    if(arr[j]=='1'){
                           
                           sum+=Math.abs(i-j);
                    
                }
            }
                ans[i]=sum;
                sum=0;
            
        }
        return ans;
    }
}