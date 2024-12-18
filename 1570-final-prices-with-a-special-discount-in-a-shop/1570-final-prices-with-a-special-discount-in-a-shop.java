class Solution {
    public int[] finalPrices(int[] prices) {

        for(int i=0;i<prices.length;i++){
            if(i!=prices.length-1){
                for(int k=i+1;k<prices.length;k++){
                if(prices[k]<=prices[i]){
                    prices[i]=prices[i]-prices[k];
                    break;
                }
                }
            }
            

        }
        return prices;
        
    }
  
}