class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr= new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[s]=nums[i];
                s++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}