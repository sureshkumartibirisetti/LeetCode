class Solution {
    private static final int mod = 1_000_000_007;
    private long[] fact, inv, invFact;
    private void precompute(int n) {
        fact = new long[n+1];
        inv = new long[n+1];
        invFact = new long[n+1];
        fact[0] = inv[0] = invFact[0] = 1;
        for (int i = 1; i <= n; i++) fact[i] = fact[i-1] * i % mod;
        inv[1] = 1;
        for (int i = 2; i <= n; i++) inv[i] = mod - (mod / i) * inv[mod % i] % mod;
        for (int i = 1; i <= n; i++) invFact[i] = invFact[i-1] * inv[i] % mod;
    }
    public int countBalancedPermutations(String num) {
        int n = num.length(), sum = 0;
        for (char c : num.toCharArray()) sum += c - '0';
        if ((sum & 1) == 1) return 0;
        precompute(n);
        int halfSum = sum / 2, halfLen = n / 2;
        int[][] dp = new int[halfSum+1][halfLen+1];
        dp[0][0] = 1;
        int[] digits = new int[10];
        for (char c : num.toCharArray()) {
            int d = c - '0';
            digits[d]++;
            for (int i = halfSum; i >= d; i--)
                for (int j = halfLen; j > 0; j--)
                    dp[i][j] = (dp[i][j] + dp[i-d][j-1]) % mod;
        }
        long res = dp[halfSum][halfLen];
        res = res * fact[halfLen] % mod * fact[n-halfLen] % mod;
        for (int cnt : digits) res = res * invFact[cnt] % mod;
        return (int)res;
    }
}
