class Solution {
    public int kthGrammar(int n, int k) {
          if (n == 1 && k == 1) {
            return 0;
        }
        int mid = (int)Math.pow(2, n - 1) / 2;
        if (k <= mid) {
            return kthGrammar(n - 1, k);
        } else {
            int result = kthGrammar(n - 1, k - mid);
            // Invert the result (0 becomes 1, and 1 becomes 0)
            return result == 0 ? 1 : 0;
        }
    }
}