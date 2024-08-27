class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            String t=arr[i];
            StringBuilder sb=new StringBuilder(t);
            arr[i]=sb.reverse().toString();
        }
        String ans="";
        for(String i : arr){
            ans+=i+" ";
        }
          return ans.trim();
    }
}