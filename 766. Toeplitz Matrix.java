class Solution {
    public boolean isToeplitzMatrix(int[][] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr[i].length-1;j++){
                if(arr[i][j]!=arr[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
