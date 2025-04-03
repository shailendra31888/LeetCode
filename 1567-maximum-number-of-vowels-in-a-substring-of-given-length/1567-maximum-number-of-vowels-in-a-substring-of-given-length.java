class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int ans = 0;

        // Initialize the first window of size k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) count++;
        }
        ans = count; // Store the first window result

        // Sliding window approach
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) count++;  // Add new vowel
            if (isVowel(s.charAt(i - k))) count--;  // Remove old vowel
            
            ans = Math.max(ans, count); // Update max vowels count
        }
        
        return ans;
    }

    public static boolean isVowel(char c) {
        return Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').contains(c);
    }
}
