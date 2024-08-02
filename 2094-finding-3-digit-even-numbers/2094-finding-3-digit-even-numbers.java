
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int size = digits.length;
        HashSet<Integer> record = new HashSet<>();
        for (int i = 0; i < size; i++) {
            if (digits[i] == 0) {
                continue;
            }
            for (int j = 0; j < size; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 0; k < size; k++) {
                    if (k == j || k == i) {
                        continue;
                    }
                    if (digits[k] % 2 == 0) {
                        int temp = digits[i] * 100 + digits[j] * 10 + digits[k];
                        record.add(temp);
                    }
                }
            }
        }
        List<Integer> retList = new ArrayList<>(record);
        Collections.sort(retList);
        int[] ret = new int[record.size()];
        int pos = 0;
        for (int i: retList) {
            ret[pos++] = i;
        }

        return ret;
    }
}