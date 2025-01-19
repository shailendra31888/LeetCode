class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid to avoid overflow

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                start = mid + 1; // Narrow search to the right
            } else {
                end = mid - 1; // Narrow search to the left
            }
        }

        // Return the position where the target should be inserted
        return start;
    }
}
