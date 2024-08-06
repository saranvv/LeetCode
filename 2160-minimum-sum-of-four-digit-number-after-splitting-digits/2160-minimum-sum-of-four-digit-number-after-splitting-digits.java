class Solution {
    public int minimumSum(int nums) {
     int[] arr=new int[4];
     for(int i=0;i<4;i++){
        arr[i]=nums%10;
        nums/=10;
     }
     Arrays.sort(arr);
     String a=arr[0]+""+arr[2]+"";
     String b=arr[1]+""+arr[3]+"";
     int n1=Integer.parseInt(a);
     int n2=Integer.parseInt(b);
     return n1+n2;
    }
}