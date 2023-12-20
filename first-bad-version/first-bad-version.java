/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int result=Integer.MAX_VALUE;
        while(start<=end){
            int m=start+(end-start)/2;
            boolean res=isBadVersion(m);
            if(res==true){
                result=Math.min(result,m);
                end=m-1;
            }else{
                start=m+1;
            }
        }
        return result;
        
    }
}