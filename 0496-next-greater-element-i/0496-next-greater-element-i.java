class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                mp.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        for(int i:st){
            mp.put(i,-1);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=mp.get(nums1[i]);
        }
        return ans;
        
        
    }
}