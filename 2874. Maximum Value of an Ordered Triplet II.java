class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0; // Need at least 3 elements for a triplet

        long res = 0;
        int maxPrefix = nums[0]; // Max value seen so far
        long maxDiff = Long.MIN_VALUE; // Max (nums[i] - nums[j]) encountered

        for (int j = 1; j < n - 1; j++) {
            // Update maxDiff using maxPrefix and nums[j]
            maxDiff = Math.max(maxDiff, (long) maxPrefix - nums[j]);

            // Compute max triplet value using maxDiff and nums[k] (nums[j+1])
            res = Math.max(res, maxDiff * nums[j + 1]);

            // Update maxPrefix for future calculations
            maxPrefix = Math.max(maxPrefix, nums[j]);
        }

        return res;
    }
}
