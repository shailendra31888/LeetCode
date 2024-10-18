class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: If the array is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Start by assuming the first string is the common prefix
        String prefix = strs[0];
        
        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Keep reducing the prefix until it matches the start of the current string
            while (strs[i].indexOf(prefix) != 0) {
                // Remove the last character from the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
