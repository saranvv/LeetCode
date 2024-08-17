class Solution {
    public String largestNumber(int[] nums) {
         String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });
      
        StringBuilder largestNumber = new StringBuilder();
        for (String numStr : numStrs) {
            largestNumber.append(numStr);
        }
        return largestNumber.toString();
    }
}