class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int l=temp.length;
        int[] arr=new int[l];
         Stack<Integer> stack = new Stack<>();
        for(int i=0;i<l-1;i++){
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int index = stack.pop();
                arr[index] = i - index; 
        }
          stack.push(i);
        }
        return arr;
    }
}