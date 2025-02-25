class Solution {
    public int totalHammingDistance(int[] nums) {
        int total = 0;
        int n = nums.length;

        // Iterate over each bit position (0 to 31 for 32-bit integers)
        for (int i = 0; i < 32; i++) {
            int countOnes = 0;

            // Count how many numbers have a 1 at the i-th bit position
            for (int num : nums) {
                countOnes += (num >> i) & 1;
            }

            // The number of zeros is (n - countOnes)
            int countZeros = n - countOnes;

            // Hamming distance for this bit is countOnes * countZeros
            total += countOnes * countZeros;
        }

        return total;
    }
}
