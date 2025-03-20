class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int m=mat[0].length;
        int n=mat.length;
        if(m*n==r*c){
            int[][] res=new int[r][c];
            int a=0;
            int b=0;
            for(int[] i:mat){
                for(int j:i){
                    if(b==c){
                        a++;
                        b=0;
                    }
                    if(a<r){
                        res[a][b]=j;
                        b++;
                    }

                }
            }
            return res;
        }
        return mat;
    }
}
