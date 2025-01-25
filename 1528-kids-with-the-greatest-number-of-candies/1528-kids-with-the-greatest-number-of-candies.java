class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for(int i:candies){
            if(max<i) max=i;
        }
       
        List<Boolean> ls = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max) ls.add(true);
            else ls.add(false);
        }
        return ls;
        
    }
}