class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;    
        int n = grid[0].length; 
        int ans = 0;

        for (int i = 0; i < m; i++) {
            int low = 0, high = n; 
            while (low < high) { 
                int mid = low + (high - low) / 2;
                if (grid[i][mid] < 0) {
                    high = mid; 
                } else {
                    low = mid + 1;  
                }
            }
            
            ans += n - low;                  
        }

        return ans;
        
    }
}
