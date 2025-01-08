class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] ans= new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int k= st.pop();
                ans[k] = i-k;
            }
            st.push(i);
        }
        return ans;
        
    }
}