class Solution {
public:
    string decodeMessage(string key, string message) {
          StringBuilder ans = new StringBuilder();

        HashMap<Character, Character> map = new HashMap<>();

        key = key.replace(" ","");
        char ch = 'a';
        for(char i : key.toCharArray()){
            if(map.containsKey(i) == false)
                map.put(i,ch++);
        }

        for(char i : message.toCharArray()){
            if(map.containsKey(i))
                ans.append(map.get(i));
            else
                ans.append(i);
        }

        return ans.toString();
    }
};