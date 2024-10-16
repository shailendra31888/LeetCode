class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int k= height.length-1;
        int m= 0;
        while(i<k){
            int width = Math.abs(i-k);
            int area= Math.min(height[i],height[k])*width;
            if(area>m){
                m= area;
            }
            if(height[i]>height[k]){
                k--;
            }
            else{
                i++;
            }
            
        }
        return m;
        
    }
}