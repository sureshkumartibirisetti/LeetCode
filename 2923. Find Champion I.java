class Solution {
    public int findChampion(int[][] grid) {
        int res=0;
        int count1=0;
        for(int i=0;i< grid.length;i++){
            int count=0;
            for(int j=0;j<grid[i].length;j++){
                if(i!=j){
                    if(grid[i][j]==1){
                        count++;
                    }
                }
            }
            if(count>count1){
                count1=count;
                res=i;
            }

        }
        return res;
    }
}
