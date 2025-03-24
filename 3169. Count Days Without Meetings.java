class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int m = 0;
        int cs = -1, ce = -1;

        for (int[] m1 : meetings) {
            int start = m1[0], end = m1[1];
            if (start > ce) {
                if (ce != -1) {
                    m += (ce - cs + 1);
                }
                cs = start;
                ce = end;
            } else {
                ce = Math.max(ce, end);
            }
        }

        if (ce != -1) {
            m += (ce - cs + 1);
        }

        return (days - m);
    }
}
