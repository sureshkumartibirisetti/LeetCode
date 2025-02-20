class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] arr = new int[n][n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = c;
                c++;
            }
        }

        int row = 0, col = 0; 
        for (String command : commands) {
            if (command.equals("RIGHT")) {
                col = Math.min(col + 1, n - 1); 
            } else if (command.equals("DOWN")) {
                row = Math.min(row + 1, n - 1); 
            } else if (command.equals("UP")) {
                row = Math.max(row - 1, 0); 
            } else if (command.equals("LEFT")) {
                col = Math.max(col - 1, 0); 
            }
        }
        return arr[row][col]; 
        
    }
}
