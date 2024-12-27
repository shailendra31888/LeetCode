class Solution {
    public int[] twoSum(int[] nums, int target) {
        int count=0;
        int n = nums.length;
        int[] arr= new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                count=nums[i]+nums[j];
                if(count==target){
                    arr[0]=i;
                    arr[1]=j;
                }
                count=0;

            }
        }
        return arr;
        
    }
}