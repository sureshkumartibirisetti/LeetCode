class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        long count = 0, equals = 0;
        Map<Integer, Long> mpp = new HashMap<>();
        mpp.put(0, 1L);
        for (int i : nums) {
            if (i % modulo == k) equals++;
            int rem = (int)(equals % modulo);
            int needed = (rem - k + modulo) % modulo;
            count += mpp.getOrDefault(needed, 0L);
            mpp.put(rem, mpp.getOrDefault(rem, 0L) + 1);
        }
        return count;
    }
}
