class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(numbers[i],i);
        }
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-numbers[i])){
                ans[0]=i+1;
                ans[1]=map.get(target-numbers[i])+1;
                break;
            }

        }
        Arrays.sort(ans);
        return ans;
        
    }
}