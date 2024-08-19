class Solution {
    public String reverseVowels(String s) {
        StringBuilder temp=new StringBuilder(); 
      for(int i=0;i<s.length();i++) 
        { 
         if(isVowel(s.charAt(i)))
         { 
          temp.append(s.charAt(i));
         }
      } 
      int len=temp.length()-1;
     char[] arr=s.toCharArray();
      for(int i=0;i<arr.length;i++)
        {
          if (isVowel(arr[i])) 
        { 
         arr[i]=temp.charAt(len); 
         len--; 
          }
      }
        return new String(arr); 
    }
    private static boolean isVowel(char ch) 
    { 
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}