class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> li = new ArrayList<>();
        int x = 0;

        for (int i = 1; i <= n; i++) {
            li.add("Push");
            
            if (i == target[x]) {
                x++;
            } else {
                li.add("Pop");
            }
            
            if (x == target.length) {
                break;
            }
        }
        
        return li;
    }
}