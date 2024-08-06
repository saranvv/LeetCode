class Solution {
    public int minSteps(String s, String t) {
        char[] arr=t.toCharArray();
           int count=0;
       for(int i=0;i<s.length();i++){
         boolean found = false;
        for(int j=0;j<t.length();j++){
            if(s.charAt(i)==arr[j]){
                arr[j]='*';
                 found = true;
                break;
            }
        }
        if (!found) {
                count++;
            }
       }
      
return count;
    }
}