class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i + 1 < nums.length; i++) {
            int minReq = lower - nums[i];
            int maxReq = upper - nums[i];
            int low = lowerBound(nums, i + 1, nums.length, minReq);
            int high = upperBound(nums, i + 1, nums.length, maxReq);
            ans += (high - low);
        }
        return ans;
    }

    private int lowerBound(int[] nums, int start, int end, int target) {
        int lo = start, hi = end;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    private int upperBound(int[] nums, int start, int end, int target) {
        int lo = start, hi = end;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
