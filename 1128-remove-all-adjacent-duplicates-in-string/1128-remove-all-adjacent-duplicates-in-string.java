class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if( !st.isEmpty() && st.peek()==s.charAt(i) ) st.pop();
            else st.push(s.charAt(i)); 
        }
        for(char c:st){
            ans=ans+c;
        }
        return ans;
    }
}