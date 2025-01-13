class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int one=pq.poll();
            int two=pq.poll();
            if(one != two ){
                pq.offer(one-two);
            }
        }
            return pq.isEmpty() ? 0 : pq.poll();
       
    }
}