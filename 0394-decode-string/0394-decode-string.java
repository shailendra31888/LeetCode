class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                // Build the repeat count (multi-digit numbers)
                currentCount = currentCount * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                // Push current string and count to the stacks
                countStack.push(currentCount);
                stringStack.push(currentString);
                currentString = new StringBuilder();  // Start a new currentString
                currentCount = 0;  // Reset the currentCount
            } 
            else if (ch == ']') {
                // Pop the previous count and string, repeat the current string
                int repeatCount = countStack.pop();
                StringBuilder prevString = stringStack.pop();
                for (int j = 0; j < repeatCount; j++) {
                    prevString.append(currentString);  // Append the repeated string
                }
                currentString = prevString;  // Set the currentString to the previous string
            } 
            else {
                // Append regular characters to the current string
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
}
