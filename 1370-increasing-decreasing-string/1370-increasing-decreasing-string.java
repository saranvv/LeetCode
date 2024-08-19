class Solution {
    public String sortString(String s) {
        int n=s.length();
    char[] arr=s.toCharArray();
    Arrays.sort(arr);
    String str="";
        while(str.length()!=n){
            String temp1=new String("");
            String temp2=new String("");
            for(int i=0;i<n;i++){
                if(arr[i]!='#' &&!temp1.contains(arr[i]+"")) {
                    temp1+=arr[i]+"";
                    arr[i]='#';
            }

            }
            str+=temp1;
             for(int i=n-1;i>=0;i--){
               if(arr[i]!='#'  && !temp2.contains(arr[i]+"")){
                temp2+=arr[i]+"";
                arr[i]='#';
               }
            }
        
         str+=temp2;
        }
        return str;
    }
}