class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
       
      //   Arrays.sort(strs);
        int count=0;
        int res=0;
        String s1="";
        for(int i=0;i<n-1;i++){
             s1=strs[i];
        String s2=strs[i+1];
        while(i<s1.length() && i<s2.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                count++;
            }
           
            if(count<res){
                 res=count;
            }
            else break;
        }

        }
        return s1.substring(0,count);
    
    }
}