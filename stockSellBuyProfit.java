class Solution {
    public int maxProfit(int[] prices) {
        if(prices== null || prices.length < 2) return 0;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price:prices){
    if(price < minPrice){
      minPrice = price;
    }
    maxProfit = Math.max(maxProfit,price - minPrice);
  }
  return maxProfit;
        
    }
}
