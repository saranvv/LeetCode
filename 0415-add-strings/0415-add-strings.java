class Solution {
    public String addStrings(String n1, String n2) {
        while(n1.length()!=n2.length()){
              n1=n1.length()<n2.length()? "0"+n1:n1;
              n2=n2.length()<n1.length()? "0"+n2:n2;
        }
        String str="";
        int carry=0;
        for(int i=n1.length()-1;i>=0;i--){
             int x=n1.charAt(i)-'0' +n2.charAt(i)-'0'+carry;
             if(x<10){
                  carry=0;
                  str=x+""+str;
             }
             else{
                int mod=x%10;
                str=mod+""+str;
                carry=x/=10;

             }
        }
    if(carry!=0) str=carry+""+str;
    return str;
    }
}