import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each element
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Find the element with the highest frequency
        int m = 0, majorityElement = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > m) {
                m = map.get(key);
                majorityElement = key;
            }
        }

        return majorityElement;
    }
}
