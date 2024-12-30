class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0,j=0;i<nums.length && j<nums.length;j++){
            if(nums[j]>0){
                arr[i]=nums[j];
                i+=2;
            }
           
            
         
        }
        for(int i=1,j=0;i<nums.length && j<nums.length;j++){
            if(nums[j]<0){
                arr[i]=nums[j];
                i+=2;

            }
            
         
        }
        return arr;
        
    }
}