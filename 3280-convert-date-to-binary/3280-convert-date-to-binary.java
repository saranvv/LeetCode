class Solution {
    public String convertDateToBinary(String date) {
        String ans = "";
	for(String str : date.split("-")) {
		ans+= "-";
		int value = Integer.parseInt(str);
		ans+= Integer.toBinaryString(value);
	}
	return ans.substring(1);
    }
}