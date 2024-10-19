class Solution {
    public char findKthBit(int n, int k) {
        String[] arr=new String[n];
        arr[0]="0";
        for(int i=1;i<n;i++){
            StringBuilder sb= solve(arr[i-1]);
            arr[i]=arr[i-1]+"1"+sb.reverse().toString();
        }
        return arr[n-1].charAt(k-1);
    }
        public static StringBuilder solve(String s){
            StringBuilder sb=new StringBuilder();
            for(char c : s.toCharArray()) {
                 if(c=='0') sb.append('1');
                 else sb.append('0');
            }
            return sb;
        }


    
}