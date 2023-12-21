class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int start=1;
        int end=num-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==num){
                return true;
            }else if(mid>=num/mid){end=mid-1;}
            else{start=mid+1;}
        }
        return false;
    }
}