class Solution {
   public int[] countBits(int n) {
        int[] result = new int[n + 1];
        if (n == 0) {
            return result;
        }
        result[1] = 1;
        int end = n * 2 - 1;
        for (int i = 1; i < end; i *= 2) {
            for (int j = i; j <= n && j < i * 2; j++) {
                result[j] = result[j-i] + j / i;
            }
        }
        return result;
    }

}
