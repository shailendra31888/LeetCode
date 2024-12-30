class Solution {
    public int maxProfit(int[] prices) {
        int c=prices[0];
       
        int profit=0;
        for (int i=0;i<prices.length;i++){
                int cost=prices[i]-c;
                profit = Math.max(cost,profit);
                c= Math.min(c,prices[i]); 
        }
        return profit;
        
    }
}