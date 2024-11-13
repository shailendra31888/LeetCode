public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Adjust k if it’s greater than the array length

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the rest of the array from index k to the end
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse a section of the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap the elements at start and end
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
