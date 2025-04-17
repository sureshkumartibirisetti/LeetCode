class Solution {
    public int numSpecial(int[][] mat) {
        int c_l=mat[0].length;
        int s_l=mat.length;
        int res=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                int cc=0;
                int rr=0;
                if(mat[i][j]==1){
                    for(int a=0;a<c_l;a++){
                        if(cc>1) {
                            cc=0;
                            break;
                        }
                        cc+=mat[i][a];
                    }
                    for(int b=0;b<s_l;b++){
                        if(rr>1){
                            rr=0;
                            break;
                        }
                        rr+=mat[b][j];
                    }
                }
                if(rr==1 && cc==1){
                    res++;
                }

            }
        }
        return (res);
    }
}
