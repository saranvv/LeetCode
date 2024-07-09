class Solution {
    public int numberOfBeams(String[] bank) {
      int count=0;
      int sum=0;
     for(int i=0;i<bank.length-1;i++){
        String str1=bank[i];
           for(int p=i+1;p<bank.length;p++){

        String str2=bank[p];
         for(int j=0;j<str1.length();j++){
            if(str1.charAt(j)=='1') {
            sum=count(str2);
                if(sum>0){
                    count+=sum;
                }
            
         }
         }
         if(sum>0) break;
     
           }
     }
return count;
}
    public int count(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1') count++;
        }
        return count;
    }
}