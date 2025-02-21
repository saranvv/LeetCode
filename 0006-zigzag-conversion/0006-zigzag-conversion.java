class Solution {
    public String convert(String s, int numRows) {
         if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
         StringBuilder[] arr= new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }
          int x = 0;
        boolean bool= false;

        for (char c : s.toCharArray()) {
            arr[x].append(c);
            if (x == 0 ||x == numRows - 1) {
                bool=!bool;
            }
            x+= bool ? 1 : -1;

        }
            StringBuilder ans= new StringBuilder();
        for (StringBuilder i: arr) {
            ans.append(i);
        }

        return ans.toString();
        
    
    }
}