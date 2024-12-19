class Solution {
    public int maxChunksToSorted(int[] arr) {
        int maxSoFar = 0; // Tracks the maximum value encountered so far
        int chunks = 0;   // Counts the number of chunks

        for (int i = 0; i < arr.length; i++) {
            maxSoFar = Math.max(maxSoFar, arr[i]); // Update the maximum value
            if (maxSoFar == i) { 
                // If the maximum value equals the current index, we can end a chunk
                chunks++;
            }
        }

        return chunks;
    }
}
