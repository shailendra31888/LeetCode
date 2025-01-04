class Solution {
    public String reverseWords(String s) {
        // Split the string into words based on spaces
        String[] str = s.split(" ");
        String ans = "";

        // Traverse the array from the last word to the first
        for (int i = str.length - 1; i >= 0; i--) {
            if (!str[i].isEmpty()) { // Skip empty strings (extra spaces)
                if (!ans.isEmpty()) {
                    ans += " "; // Add space only if ans already has content
                }
                ans += str[i];
            }
        }

        return ans;
    }
}
