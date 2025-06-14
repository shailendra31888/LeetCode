class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int n=nums.length;
        int o=k%n;
        for(int i=0;i<n;i++){
            ans[(k+i) % n]=nums[i];
        }
         for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
}