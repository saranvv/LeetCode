class Solution {
    public int[] plusOne(int[] digits) {
      int n=digits.length;
       long sum=0;
        for(int i=0;i<digits.length;i++){
            sum=sum*10+digits[i];
        }
        long tot=sum+1;
       String str=String.valueOf(tot);
        int[] arr=new int[str.length()];
        int i =0;
        while(tot!=0){
            long mod=tot%10;
            arr[i]=(int)mod;
            i++;
            tot/=10;
        }
        return disp(arr);
    }
    public int[] disp(int[] arr){
        int[] pls=new int[arr.length];
        int k=0;
        for(int i=arr.length-1;i>=0;i--){
            pls[k]=arr[i];
            k++;
        }
        return pls;
    }
}