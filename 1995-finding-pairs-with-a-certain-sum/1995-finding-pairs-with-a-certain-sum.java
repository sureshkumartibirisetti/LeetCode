class FindSumPairs {
    int[] n1, n2;
    Map<Integer, Integer> m = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        n1 = nums1;
        n2 = nums2;
        for (int x : n2) m.put(x, m.getOrDefault(x, 0) + 1);
    }

    public void add(int i, int v) {
        m.put(n2[i], m.get(n2[i]) - 1);
        n2[i] += v;
        m.put(n2[i], m.getOrDefault(n2[i], 0) + 1);
    }

    public int count(int t) {
        int c = 0;
        for (int x : n1) c += m.getOrDefault(t - x, 0);
        return c;
    }
}