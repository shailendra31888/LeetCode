class Solution {
    public String largestOddNumber(String num) {
        int k=-1;
        for(int i=num.length()-1;i>=0;i--){
            int n =num.charAt(i)-'0';
            if(n%2 != 0) {
            k=i ;
            break;
            }

        }
        String ans ="";
        if(k>=0){
        for(int i=0;i<=k;i++){
            ans = ans + num.charAt(i);
        }
        }
        return ans;
        
    }
}