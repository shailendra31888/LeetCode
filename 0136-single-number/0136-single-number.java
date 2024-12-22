class Solution {
    public int singleNumber(int[] nums) {
        int n= nums.length;
        if(nums.length==1){
            return nums[0];
        }
        else{
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
		            nums[i]=n+1;
		            nums[j]=n+1;
		        }
		        else{
		            continue;
		        }
                   
                }
            }
        }
        for(int i=0;i<n;i++){
		    if(nums[i]!=n+1){
		        return nums[i];
		    }
		}
        return 0;
        
    }
}