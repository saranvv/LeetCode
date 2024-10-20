class Solution {
    public int countVowelSubstrings(String word) {
        int c=0;
        for(int i=0;i<word.length();i++){
            Set<Character> set=new HashSet<>();
            for(int j=i;j<word.length();j++){
                if(!isVowel(word.charAt(j))) break;
                else{
                    set.add(word.charAt(j));
                    if(set.size()==5) c++;
                }
            }
        }
        return c;
    }
    public boolean isVowel(char x){
        if(x=='a' || x=='e' || x=='i'|| x=='o' || x=='u') return true;
        return false;
        }
}