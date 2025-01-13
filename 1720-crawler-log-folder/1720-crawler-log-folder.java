class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        int n = logs.length;
        for(int i=0;i<n;i++){
            if( logs[i].equals("../")){
                if(!st.isEmpty()) st.pop();
            }
            else if(!logs[i].equals("./") ) st.push(logs[i]);
            
        }
        
        return st.size();
    }
}