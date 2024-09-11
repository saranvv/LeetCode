class Solution {
    public int minBitFlips(int start, int goal) {
       int ans=start^goal;
       int count=0;
       String s=Integer.toBinaryString(ans);
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1') count++;
       } 

        return count;
    }
}