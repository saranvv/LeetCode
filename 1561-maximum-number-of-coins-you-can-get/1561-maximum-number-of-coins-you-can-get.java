class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int max=0;
        for(int i=piles.length/3;i<piles.length;i+=2){
            max+=piles[i];
        }
        return max;
    }
}