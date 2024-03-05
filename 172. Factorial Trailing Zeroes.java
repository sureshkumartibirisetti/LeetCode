class Solution {
    public int trailingZeroes(int n) {
        int z=0;
        for (int i=5;n/i>0;i*=5){
            z+=n/i;
        }
        return z;
        
    }
}
