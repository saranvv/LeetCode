class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr=new int[nums.length];
        int n=arr.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                arr[k++]=nums[i];
            }
        }
        int h=n-1;
        for(int i=n-1;i>=0;i--){
            if(nums[i]>pivot){
                arr[h--]=nums[i];
            }
            else if(nums[i]==pivot){
                arr[k++]=nums[i];
            }
        }
        return arr;
    }
}