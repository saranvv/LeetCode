class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n+n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        int p=n;
        for(int i=0;i<n;i++){
         int k=nums[i];
         int sum=0;
        while(k!=0){
            int mod=k%10;
            sum=sum*10+mod;
            k/=10;
        }
        arr[p++]=sum;
    }
     Arrays.sort(arr);
     int count=1;
       for(int i=0;i<n+n-1;i++){
       
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
       return count;
    }
}