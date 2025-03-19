class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (nums[i] == 0) {
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                count++;
            }
        }

        return (nums[n - 2] == 1 && nums[n - 1] == 1) ? count : -1;
    }
}
