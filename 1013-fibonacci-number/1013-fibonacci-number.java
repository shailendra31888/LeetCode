class Solution {
    public int solve(int n,int[] arr){
        if(n<=1){
            return n;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        return arr[n]=solve(n-1,arr) + solve(n-2,arr);
    }
    public int fib(int n) {
        int[] arr=new int[n+1];
        if(n<=1){
            return n;
        }
        return solve(n,arr);
    }
}