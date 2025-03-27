class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=ismatrix(matrix,j);
                }
            }
        }
        return matrix;
    }
    static int ismatrix(int[][] matrix,int c){
        int res=0;
        for(int[] i:matrix){
            if(res<i[c]){
                res=i[c];
            }
        }
        return res;
    }
}
