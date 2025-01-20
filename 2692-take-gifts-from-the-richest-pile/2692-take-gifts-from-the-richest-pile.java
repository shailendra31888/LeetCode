import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        // Max-Heap to store the gifts in descending order
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add all gift counts to the priority queue
        for (int n : gifts) {
            p.add(n);
        }

        // Perform k iterations
        for (int i = 0; i < k; i++) {
            if (p.isEmpty()) {
                break; // Avoid error if queue is empty
            }
            
            // Remove the largest element
            int largest = p.poll();
            
            // Compute the square root of the largest gift count
            int sqt = (int) Math.sqrt(largest);
            
            // Add the updated value back to the queue
            p.add(sqt);
        }

        // Calculate the sum of all remaining elements in the queue
        long sum = 0;
        while (!p.isEmpty()) {
            sum += p.poll();
        }

        return sum;
    }
}
