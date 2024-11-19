class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        
        if (s.length() > 1) {
            for (int i = 0; i < s.length(); i++) {
                char current = s.charAt(i);
                
                if (!st.isEmpty() && current == 'B' && st.peek() == 'A') {
                    st.pop();
                } else if (!st.isEmpty() && current == 'D' && st.peek() == 'C') {
                    st.pop();
                } else {
                    st.push(current);
                }
            }
        } else {
            return 1; // If the string has only one character, return 1.
        }
        
        return st.size(); // Remaining stack size is the reduced string length.
    }
}
