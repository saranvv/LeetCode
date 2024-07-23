class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.toCharArray()[i];
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(words[i])) return false;
            } else {
                if (map.containsValue(words[i])) return false;
                map.put(ch, words[i]);
            }
        }

        return true;
    }
        
    }
