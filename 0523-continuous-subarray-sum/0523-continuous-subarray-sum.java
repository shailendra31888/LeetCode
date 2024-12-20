class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2) {
            return false;
        }
        
        // Map to store remainder and its first occurrence index
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); // For edge case where the sum itself is divisible by k
        
        int cumulativeSum = 0;
        for (int i = 0; i < nums.length; i++) {
            cumulativeSum += nums[i];
            int remainder = cumulativeSum % k;
            
            // Handle negative remainders
            if (remainder < 0) {
                remainder += k;
            }
            
            if (remainderMap.containsKey(remainder)) {
                // Check if subarray length is at least 2
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderMap.put(remainder, i);
            }
        }
        
        return false;
    }
}
