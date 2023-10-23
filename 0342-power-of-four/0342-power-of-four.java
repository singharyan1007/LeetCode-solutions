class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0)return false;
        double a=Math.floor(Math.log(n)/Math.log(4));
        double b=Math.ceil(Math.log(n)/Math.log(4));

        return a==b;
    }
}