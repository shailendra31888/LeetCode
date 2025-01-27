class Solution {
    public String reverseVowels(String s) {
        ArrayList<Integer> ar = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        
        // Collect indices and vowels
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                ar.add(i);
                str.append(c);
            }
        }

        // Replace vowels in reverse order
        int w = str.length() - 1; // Start from the last vowel
        char[] chars = s.toCharArray(); // Convert string to char array for mutable operations
        for (int i = 0; i < ar.size(); i++) {
            chars[ar.get(i)] = str.charAt(w--); // Replace character at vowel index
        }

        return new String(chars); // Convert char array back to string
    }
}
