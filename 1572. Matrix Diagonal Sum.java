class Solution {
    public int diagonalSum(int[][] arr) {
        int n=arr.length;
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if((i==j)||(i+j)==(n-1)){
                    sum1+=arr[i][j];
                }
            }
        }
        return sum1;
    }
}
