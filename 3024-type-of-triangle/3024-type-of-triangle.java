class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
         if(a+b>c&&b+c>a&&a+c>b){
        if(a==b&&a==c) return"equilateral";
        if(a==b||a==c||b==c) return  "isosceles";
        if(a+b>c&&b+c>a&&a+c>b) return"scalene";

         }
        return "none";
    }
}