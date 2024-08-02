class Solution {
    public boolean queryString(String s, int n) {
        for(int i=1;i<=n;i++){
            String str=find(i);
            if(!s.contains(str)) return false;
        }
        return true;
    }
    String find(int i){
        String str="";
        while(i>0){
            str=i%2+""+str;
            i/=2;
        }
        return str;
            }
}