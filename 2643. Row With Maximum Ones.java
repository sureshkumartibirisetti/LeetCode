class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int i_l=0;
        int v=0;
        for(int i=0;i<mat.length;i++){
            int res=0;
            for(int j=0;j<mat[i].length;j++){
                res+=mat[i][j];
            }
            if(v<res){
                v=res;
                i_l=i;
            }
        }
        return (new int[]{i_l,v});
    }
}
