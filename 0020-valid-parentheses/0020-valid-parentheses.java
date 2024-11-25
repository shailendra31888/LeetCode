class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
         Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } 
            // Check for matching closing brackets
            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } 
            // If no match, return false
            else {
                return false;
            }
        }
        
        // If stack is empty, parentheses are balanced
        return stack.isEmpty();
    }
    }
