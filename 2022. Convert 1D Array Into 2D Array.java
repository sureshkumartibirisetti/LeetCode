class Solution {
    public int[][] construct2DArray(int[] mat, int r, int c) {
        if(mat.length==r*c){
            int[][] res=new int[r][c];
            int a=0;
            int b=0;
            for(int i:mat){
                    if(b==c){
                        a++;
                        b=0;
                    }
                    if(a<r){
                        res[a][b]=i;
                        b++;
                    }

            }
            return res;
        }
        return new int[][]{};
    }
}
