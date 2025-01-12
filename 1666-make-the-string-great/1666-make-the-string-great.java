class Solution {
    public String makeGood(String s) {
        int n= s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(!st.isEmpty() && Math.abs(st.peek()-s.charAt(i))==32 ) st.pop();
            else st.push(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        for(char c:st){
            ans.append(c);
        }
        return ans.toString();
        
    }
}