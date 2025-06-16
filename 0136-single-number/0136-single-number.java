class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=nums.length-1 && nums[i]==nums[i+1]){
                arr.add(nums[i]);
            }
        }
         for(int i=0;i<nums.length;i++){
            if(!arr.contains(nums[i])){
                return nums[i];
            }
        }
        
        return nums[0];
    }
}