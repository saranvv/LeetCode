class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        int[] arr=new int[str.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=(str[i].charAt(str[i].length()-1))-'0';
        }
        String[] ar=new String[str.length];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
              if(str[j].contains(arr[i]+"")){
                ar[i]=str[j].substring(0,str[j].length()-1);
              }
            }
        }
        String ans="";
        for(String w: ar){
            ans+=w+" ";
        }
        return  ans.trim();
    }
}