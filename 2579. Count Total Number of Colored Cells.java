class Solution {
    public long coloredCells(int n) {
       long res=1;
        for(int i=2; i<=n; i++){
            res+=(i-1)*4; 
        }
        return res;
    }
}
