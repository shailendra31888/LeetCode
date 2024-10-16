class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n= money;
        if(prices.length >1){
            for(int i=0;i<2;i++){
                money=money - prices[i];
            }
            if(money < 0){
                return n ;
            }
            return money;
            
        }
        return money;
       
        
    }
}