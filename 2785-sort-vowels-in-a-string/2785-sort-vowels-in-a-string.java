class Solution {
    public String sortVowels(String s1) {
         char[] s=s1.toCharArray();
        String str="";
        String vow="AEIOUaeiou";
        for(int i=0;i<s.length;i++){
             for(int j=0;j<vow.length();j++){
            if(s[i]==vow.charAt(j)){
                str+=s[i];
                s[i]='-';
            }  
        }
        }
         char[] arr=str.toCharArray();
        
        Arrays.sort(arr);
        int x=0;
          for(int i=0;i<s.length;i++){
              if(s[i]=='-'){
                s[i]=arr[x++];
              }
        }

        String ans="";
        for(int i=0;i<s.length;i++){
            ans+=s[i];
        }
        return ans;
    }
}