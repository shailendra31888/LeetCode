class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0; // To track the number of modifications
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) { // A violation found
                count++;
                if (count > 1) return false; // More than one modification needed
                
                // Decide which element to modify:
                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1]; // Modify nums[i] to "flatten" the slope
                } else {
                    nums[i + 1] = nums[i]; // Modify nums[i+1] to fix the order
                }
            }
        }
        
        return true;
    }
}
