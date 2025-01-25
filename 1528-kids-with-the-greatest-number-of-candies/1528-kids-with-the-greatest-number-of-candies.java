class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:candies){
            p.offer(i);
        }
        int max = p.poll();
        for(int i=0;i<candies.length;i++){
            candies[i]+=extraCandies;
        }
        List<Boolean> ls = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]>=max) ls.add(true);
            else ls.add(false);
        }
        return ls;
        
    }
}