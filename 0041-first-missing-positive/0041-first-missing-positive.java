class Solution {
    public int firstMissingPositive(int[] nums) {
        // Step 1: Replace out-of-range numbers with nums.length + 1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] > nums.length) {
                nums[i] = nums.length + 1;
            }
        }

        // Step 2: Mark indices corresponding to seen numbers as negative
        for (int i = 0; i < nums.length; i++) {
            int e = Math.abs(nums[i]); // Take the absolute value of nums[i]
            if (e <= nums.length) {   // Only mark indices within range
                int s = e - 1;        // Convert 1-based to 0-based index
                if (nums[s] > 0) {    // Mark as negative only if not already marked
                    nums[s] = -nums[s];
                }
            }
        }

        // Step 3: Find the first positive number's index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i + 1; // The first missing positive is i+1
            }
        }

        // If all numbers from 1 to nums.length are present
        return nums.length + 1;
    }
}
