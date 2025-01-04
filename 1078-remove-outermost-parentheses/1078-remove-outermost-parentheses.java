class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (!st.isEmpty()) {
                    // Only add '(' to str if it's not an outermost '('
                    str = str + ch;
                }
                st.push(ch);
            } else if (ch == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
                if (!st.isEmpty()) {
                    // Only add ')' to str if it's not an outermost ')'
                    str = str + ch;
                }
            }
        }
        return str;
    }
}
