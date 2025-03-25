class Solution {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        int champion = 0;

        for (int i = 1; i < n; i++) {
            if (grid[i][champion] == 1) {
                champion = i;
            }
        }

        return champion;
    }
}
