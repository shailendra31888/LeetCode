class Solution {
    public int lastRemaining(int n) {
        int step=1;
        int remaing=n;
        boolean l = true;
        int h=1;
        while(remaing>1){
            if(l || remaing%2==1){
                h+=step;
            }
            step = step*2;
            remaing /=2;
            l=!l;
        }
        return h;
        
        
    }
}