class Solution {
    public int compress(char[] ch) {
        int n=ch.length;
        char[] chars=new char[n];
        int x=0;
        for(char c:ch){
        chars[x++]=c;
        }
        
      List<Character> arr=new ArrayList<>();
        int count;

        for(int i=0;i<n;i++){
            count=1;
            if(chars[i]!='#'){
                 for(int j=i+1;j<n;j++){
               if(chars[i]==chars[j]){
                   count++;
            chars[j]='#';
               } 
            }
            arr.add(ch[i]);
            if(count>1){
              String str=count+"";
              for(int k=0;k<str.length();k++){
                arr.add(str.charAt(k));
              }
             
            } 
            }
        
        }
       for(int i=0;i<arr.size();i++){
        ch[i]=arr.get(i);
       }
        return arr.size();
    }
}