class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i:piles){
            pq.add(i);
        }
        for(int i=0;i<k;i++){
            int temp = pq.poll();
            pq.offer((temp+1)/2);
        }
        int ans=0;
        for(int i:pq){
            ans +=i;
        }
        return ans;
        
    }
}