class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        String str="";
        for(int i=0;i<k;i++){
            str+=arr[i]+" ";
        }
        return str.trim();
    }
}