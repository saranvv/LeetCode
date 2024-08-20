class Solution {
    public int compress(char[] ch) {
     String str="";
      int count=1;
     for(int i=1;i<ch.length;i++){
         
        if(ch[i]==ch[i-1]){
            count++;

        }
        else{
            if(count>1){
                str+=ch[i-1];
                str+= count+"";
                count=1;
            }
            else{
                str+=ch[i-1];
                  count=1;
            }
        }
     }
    
      if(count>1){
                str+=ch[ch.length-1];
                str+= count+"";
                count=1;
            }
            else{
                str+=ch[ch.length-1];
                  count=1;
            }
     char[] arr=str.toCharArray();
      for(int i=1;i<arr.length;i++){
        ch[i]=arr[i];
     }
        return arr.length;
    }
}