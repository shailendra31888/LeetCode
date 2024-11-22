class Solution {
    public boolean isPalindrome(int x) {
        int l= revrse(x);
        if(x<0){
            return false;
        }
        else if(x==l){
            return true;
        }
        return false;
        
    }
    public static int revrse(int n){
        int l=0;
        while(n!=0){
        int k = n%10;
        l = l*10+k;
        n=n/10;
        }
        return l;

    }
}