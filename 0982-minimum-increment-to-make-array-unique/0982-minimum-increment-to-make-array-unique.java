class Solution {
    public static int max(int[] num){
        int min= Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>min){
                min=num[i];
            }
        }
        return min;
    }
    public int minIncrementForUnique(int[] nums) {
        int maxi=max(nums);
        int n =maxi+nums.length;
        int[] count= new int[n];
        for(int i:nums){
            count[i]++;
        }
        int m=0;
        for(int i=0;i<n;i++){
            if(count[i]<=1) continue;
            int e = count[i]-1;
            m+=e;
            count[i+1] +=e;
        }
        return m;
        
        
    }
}
