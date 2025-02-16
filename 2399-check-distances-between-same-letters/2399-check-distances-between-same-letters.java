class Solution {
    public boolean checkDistances(String s, int[] distance) {
         for(int i=0;i<26;i++)
        {
            char c = (char)('a'+i);
            if(s.contains(String.valueOf(c)))
            {
                int f= s.indexOf(c);
                int l= s.lastIndexOf(c);
                if(l-f-1!=distance[i])
                    return false;
            }
        }
        return true;
    }
}