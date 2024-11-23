class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        // Create DP table
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        // Base case: empty string matches empty pattern
        dp[0][0] = true;
        
        // Handle patterns with '*'
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2]; // '*' matches zero preceding elements
            }
        }
        
        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char currentS = s.charAt(i - 1);
                char currentP = p.charAt(j - 1);
                
                if (currentP == '.' || currentP == currentS) {
                    // Characters match
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (currentP == '*') {
                    // '*' matches zero or more of the preceding element
                    dp[i][j] = dp[i][j - 2]; // Zero occurrence
                    char precedingP = p.charAt(j - 2);
                    if (precedingP == '.' || precedingP == currentS) {
                        dp[i][j] |= dp[i - 1][j]; // One or more occurrences
                    }
                }
            }
        }
        
        // Return the result
        return dp[m][n];
    }
}
