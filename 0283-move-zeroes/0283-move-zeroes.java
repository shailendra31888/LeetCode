class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos++] = nums[i];
            }
        }

        // Fill remaining positions with zeroes
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
