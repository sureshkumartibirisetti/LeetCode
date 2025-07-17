class Solution {
    public int maximumLength(int[] nums, int k) {
        int res = 2;
        for (int j = 0; j < k; j++) {
            int[] dp = new int[k];

            for (int i = 0; i < nums.length; i++) {
                int mod = nums[i] % k;
                int pos = (j - mod + k) % k;
                dp[mod] = dp[pos] + 1;
            }

            for (int val : dp) {
                res = Math.max(res, val);
            }
        }
        return res;
    }
}