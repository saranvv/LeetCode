class Solution {
    public int maximum69Number (int num) {
        int[] arr=new int[4];
        for(int i=0;i<4;i++){
      arr[i]=num%10;
      num/=10;
       }
       int temp=0;
       for(int i=3;i>=0;i--){
        if(arr[i]==6){
            arr[i]=9;
            break;
        }
       }
        Arrays.sort(arr);
         for(int i=3;i>=0;i--){
             temp=temp*10+arr[i];
        }
      return temp;
    }
}