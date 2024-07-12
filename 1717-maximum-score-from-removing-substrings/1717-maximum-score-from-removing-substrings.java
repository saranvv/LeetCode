class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        int sum = 0;
        
        if (y > x) {
            int temp = x;
            x = y;
            y = temp;
            s = new StringBuilder(s).reverse().toString();
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (!st1.isEmpty() && st1.peek() == 'a' && s.charAt(i) == 'b') {
                st1.pop();
                sum += x;
            } else {
                st1.push(s.charAt(i));
            }
        }
        
        while (!st1.isEmpty()) {
            char c = st1.pop();
            if (!st2.isEmpty() && st2.peek() == 'b' && c == 'a') {
                st2.pop();
                sum += y;
            } else {
                st2.push(c);
            }
        }
        
        return sum;
    }
}
