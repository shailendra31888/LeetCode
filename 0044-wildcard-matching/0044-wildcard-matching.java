class Solution {
    public boolean isMatch(String s, String p) {
        
        int m = s.length(), n = p.length();
        // DP table initialization
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        dp[0][0] = true; // Both empty string and pattern match
        
        // Handle case where pattern starts with '*' matching empty string
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1]; // '*' can match empty string
            }
        }
        
        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char patternChar = p.charAt(j - 1);
                
                if (patternChar == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1]; // '*' can match 0 or more characters
                } else if (patternChar == '?' || s.charAt(i - 1) == patternChar) {
                    dp[i][j] = dp[i - 1][j - 1]; // Exact match or '?' match
                }
            }
        }
        
        return dp[m][n];
    
        
    }
}