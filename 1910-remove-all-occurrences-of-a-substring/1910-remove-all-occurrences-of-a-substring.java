class Solution {
    public String removeOccurrences(String s, String part) {
        if(!s.contains(part)) return s;
        String str="";        
        while(s.contains(part)){
        str=s.replaceFirst(part,"");
        s=str;
    }
    return str;
    }
}