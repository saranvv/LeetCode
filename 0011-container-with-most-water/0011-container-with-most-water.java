class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int ans=0;
        while(i<j){
            int min= Math.min(arr[i],arr[j]);
            int x=j-i;
            int temp=min*x;
            ans=Math.max(temp,ans);
            if(arr[i]< arr[j]) i++;
            else j--;

        }
        return ans;
    }
}