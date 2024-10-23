/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=0;
        int end = n;
        int bad =0;
        while(s<=end){
            int mid= s+(end-s)/2;
            if( isBadVersion(mid)){
                end=mid-1;
                bad=mid;
            }
            else {
                s= mid+1;
            }

        }
        return bad;
           
      
    } 
}