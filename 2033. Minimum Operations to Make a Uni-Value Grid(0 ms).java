class Solution {
    public int minOperations(int[][] grid, int x) {

        int m = grid.length, n = grid[0].length;

        int len = m * n;
        if(len < 2) return 0;
        
        int[] count = new int[10001];

        int totalSum = 0;
        int r = grid[0][0] % x;
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                int v = grid[i][j];
                if(v % x != r) return -1;
                count[v]++;
            } 
        }
        
        len = (len + 1) / 2;
        int total = 0;
        int median = 0;

        for(int v = 0; v < count.length; ++v){
            if(count[v] == 0) continue;
            total += count[v];
            if(total >= len){
                median = v;
                break;
            }
        }
        
        int ans = 0;
        for(int v = 0; v <= median; ++v){
            if(count[v] == 0) continue;
            ans += count[v] * (median - v) / x;
        }

        for(int v = median + 1; v < count.length; ++v){
            if(count[v] == 0) continue;
            ans += count[v] * (v - median) / x;
        }        
        return ans;
    }
}
