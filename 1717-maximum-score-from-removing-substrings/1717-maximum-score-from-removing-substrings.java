class Solution {
    public int maximumGain(String s, int x, int y) {
        int maxPoints = 0;
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;

        // First pass to remove "ab"
        while (i < n) {
            char current = arr[i];
            if (!stack.isEmpty() && stack.peek() == 'a' && current == 'b') {
                stack.pop(); // Remove 'a' from stack
                maxPoints += x; // Gain x points
            } else {
                stack.push(current);
            }
            i++;
        }

        // Second pass to remove "ba"
        Stack<Character> secondStack = new Stack<>();
        while (!stack.isEmpty()) {
            char current = stack.pop();
            if (!secondStack.isEmpty() && secondStack.peek() == 'b' && current == 'a') {
                secondStack.pop(); // Remove 'b' from second stack
                maxPoints += y; // Gain y points
            } else {
                secondStack.push(current);
            }
        }

        return maxPoints;
    }
}
