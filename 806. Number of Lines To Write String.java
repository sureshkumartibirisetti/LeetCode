class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum = 0, row = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sum += widths[ch - 'a'];
            if (sum > 100) {
                row++;
                sum = widths[ch - 'a'];
            }
        }
        return new int[]{++row, sum};
    }
}
