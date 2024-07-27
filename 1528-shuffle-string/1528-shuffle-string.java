class Solution {
    public String restoreString(String s, int[] indices) {
        int n=indices.length;
        char[] arr=s.toCharArray();
        for(int i=0;i<n;i++){
            arr[indices[i]]=s.charAt(i);
        }
        String str="";
         for(int i=0;i<n;i++){
            str+=arr[i];
        }
        return str;
    }
}