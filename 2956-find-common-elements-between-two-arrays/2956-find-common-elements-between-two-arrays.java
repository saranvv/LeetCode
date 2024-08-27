class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
       int l=0;
       int r=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    l++;
                    break;
                }
            }
        }
        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    r++;
                    break;
                }
            }
        }
        int[] arr=new int[2];
        arr[0]=l;
        arr[1]=r;
        return arr;
    }
}