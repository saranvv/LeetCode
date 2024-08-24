class Solution {
    public int minSteps(String s, String t) {
     int count=0;
     char[] c1=s.toCharArray();
     char[] c2=t.toCharArray();
   int k=0;
         for(int i=0;i<c1.length;i++){
              boolean bool=false;
            for(int j=0;j<c2.length;j++){
                if(c1[i]==c2[j]) {
                    bool=true;
                    k=j;
            }
            }
            if(bool) c2[k]='#';
            else count++;
            
         }
          char[] a1=t.toCharArray();
     char[] a2=s.toCharArray();
        for(int i=0;i<a1.length;i++){
              boolean bool=false;
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]) {
                    bool=true;
                    k=j;
            }
            }
            if(bool) a2[k]='#';
            else count++;
         }
     return count;

    }
}