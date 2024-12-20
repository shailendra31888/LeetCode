class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int count=0;
        LinkedHashSet<Integer> map = new LinkedHashSet<>();
        for(int j=0;j<n;j++){
            map.add(nums[j]);
        }
        int i=0;
        for(int j:map){
            nums[i]=j;
            i++;
        }
        
        return map.size();
        
    }
}