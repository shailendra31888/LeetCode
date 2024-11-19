class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        Stack<Character> st1 = new Stack<>();
        while(!st.isEmpty()){
            st1.push(st.pop());
        }

        StringBuilder str = new StringBuilder();
        while(!st1.isEmpty()){
            str = str.append(st1.pop());
        }
        return str.toString();

        
    }
}