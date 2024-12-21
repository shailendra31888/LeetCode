class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;      // Current consecutive ones count
        int maxCount = 0;   // Maximum consecutive ones count

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++; // Increment count for a 1
                maxCount = Math.max(maxCount, count); // Update maxCount if count is higher
            } else {
                count = 0; // Reset count when a 0 is encountered
            }
        }

        return maxCount;
    }
}
