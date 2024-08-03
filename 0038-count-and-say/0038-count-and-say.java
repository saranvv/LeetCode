class Solution {
    public String countAndSay(int n) {
        if(n<1) return "";
        String str="1";
        for(int i=1;i<n;i++){
             str=find(str);
        }
        return str;
    }
    String find(String str){
        String s="";
        int count=1;
        int i;
         for(i=0;i<str.length()-1;i++){
             if(str.charAt(i)==str.charAt(i+1)){
                count++;}
                else{
                    s+=count+""+str.charAt(i);
                    count=1;
                }
         }
             s+=count+""+str.charAt(i);
          
         return s;
          
    }
}