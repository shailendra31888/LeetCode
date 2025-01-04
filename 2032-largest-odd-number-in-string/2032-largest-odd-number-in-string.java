class Solution {
    public String largestOddNumber(String num) {
        int k=num.length()-1;
        while(k>=0){
            int n = num.charAt(k);
            if(n%2 !=0) {
                return num.substring(0,k+1);
            }
            k--;
        }
        return "";
    }
}