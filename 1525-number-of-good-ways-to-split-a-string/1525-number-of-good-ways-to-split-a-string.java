class Solution {
    public int numSplits(String s) {
        int n=s.length();
        int[] a=new int[n];
        int[] b=new int[n];
        Set<Character> s1=new HashSet<>();
        for(int i=0;i<n;i++){
            s1.add(s.charAt(i));
            a[i]=s1.size();
        }
        Set<Character> s2=new HashSet<>();
        for(int i=n-1;i>=0;i--){
            s2.add(s.charAt(i));
            b[i]=s2.size();
        }
        int count=0;
         for(int i=0;i<n-1;i++){
           if(a[i]==b[i+1]) count++;
        }
        return count;
    }
}