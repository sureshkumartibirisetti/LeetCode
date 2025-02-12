class Solution {
    public int oddCells(int m, int n, int[][] arr) {
        int index=0;
        int[][] res=new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                index = 0;
                if (j > 0) {
                    while (index < res.length) {
                        res[index][arr[i][j]] += 1;
                        index++;
                    }
                } else {
                    while (index < res[0].length) {
                        res[arr[i][j]][index] += 1;
                        index++;
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                if(res[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}
