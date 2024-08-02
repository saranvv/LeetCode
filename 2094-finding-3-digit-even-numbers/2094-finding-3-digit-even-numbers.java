class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n=digits.length;
         HashSet<Integer> st = new HashSet<>();
        
        for(int i=0;i<n;i++){
            if (digits[i]==0) continue;
            for(int j=0;j<n;j++){
                 if(i==j) continue;
                for(int k=0;k<n;k++){
                      if (k==i||k==j) continue;
                     if(digits[k]%2==0){
                        int x=(digits[i]*100+digits[j]*10+digits[k]);
                    st.add(x);
                     }
                }
            }
        }
         List<Integer> arr=new ArrayList<>(st);
          Collections.sort(arr);
   int ans[]=new int[arr.size()];
   int p=0;
        for(int i:arr){
            ans[p++]= ;
      }
  
        return ans;
    }
}