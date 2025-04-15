class Solution {
    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[nums2[i]] = i;
        }

        int[] mapped = new int[n];
        for (int i = 0; i < n; i++) {
            mapped[i] = pos[nums1[i]];
        }

        long[] left = new long[n];
        int[] bit = new int[n + 2]; 
        for (int i = 0; i < n; i++) {
            left[i] = query(bit, mapped[i]);
            update(bit, mapped[i] + 1, 1); 
        }

        long[] right = new long[n];
        bit = new int[n + 2];

        for (int i = n - 1; i >= 0; i--) {
            right[i] = query(bit, n) - query(bit, mapped[i] + 1);
            update(bit, mapped[i] + 1, 1);
        }

        long res = 0;
        for (int i = 0; i < n; i++) {
            res += left[i] * right[i];
        }
        return res;
    }

    void update(int[] bit, int i, int val) {
        while (i < bit.length) {
            bit[i] += val;
            i += i & -i;
        }
    }

    int query(int[] bit, int i) {
        int res = 0;
        while (i > 0) {
            res += bit[i];
            i -= i & -i;
        }
        return res;
    }
}
