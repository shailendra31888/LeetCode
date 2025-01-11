class Solution {
    public int calPoints(String[] operations) {
        int n= operations.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(operations[i].equals("D")){ 
                st.push(st.peek()*2);
            }
            else if(operations[i].equals("C")) st.pop();
            else if(operations[i].equals("+")){
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);  // Push the original top back
                st.push(newTop);
            }
            else st.push(Integer.parseInt(operations[i]));
        }
        int ans = 0;
        for(int i:st){
            ans=ans+i;
        }
        return ans;
        
    }
}