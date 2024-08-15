class Solution {
    public int[] decode(int[] encoded) {
         int x=0;
        int n=encoded.length+1;
        for(int i=1;i<=n;i++){
            x^= i; 
        }
        for(int i=1;i<n-1;i+=2) {
        x^= encoded[i];
        }
        
        int[] arr=new int[n];
        arr[0]=x;
        for(int i=0;i<n-1;i++){
            arr[i+1]=arr[i]^encoded[i];
        }
        return arr;
    }
}