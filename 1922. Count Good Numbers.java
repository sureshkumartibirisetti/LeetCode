class Solution {
    static final int MOD = 1000000007;

    public int countGoodNumbers(long chakraLength) {
        long evenPositions = (chakraLength + 1) / 2; // like left side of scroll
        long oddPositions = chakraLength / 2;        // right side of scroll
        long evenWays = fastPower(5, evenPositions); // 5 even digits
        long oddWays = fastPower(4, oddPositions);   // 4 prime digits

        return (int)((evenWays * oddWays) % MOD);
    }

    // Chakra Power Boost: Fast Exponentiation
    long fastPower(long base, long power) {
        long result = 1;
        base %= MOD;

        while (power > 0) {
            if (power % 2 == 1) {
                result = (result * base) % MOD; // apply current jutsu
            }
            base = (base * base) % MOD; // double chakra burst
            power /= 2; // halve the turns
        }
        return result;
    }
}
