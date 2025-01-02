import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> sumFrequency = new HashMap<>();

        // Initialize the map with prefixSum 0 to handle cases where a subarray starts from index 0
        sumFrequency.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            // Check if (prefixSum - k) exists in the map
            if (sumFrequency.containsKey(prefixSum - k)) {
                count += sumFrequency.get(prefixSum - k);
            }

            // Update the frequency of the current prefixSum in the map
            sumFrequency.put(prefixSum, sumFrequency.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
