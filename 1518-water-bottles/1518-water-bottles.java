class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
int sum=numBottles;
       while(numBottles>=numExchange){
          int re=numBottles/numExchange;
          
          sum+=re;
          
         
          numBottles=re+(numBottles%numExchange);
  }
       return sum;
    }
}