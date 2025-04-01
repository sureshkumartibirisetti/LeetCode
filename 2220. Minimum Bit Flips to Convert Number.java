class Solution {
    public int minBitFlips(int x, int y) {
        int count = 0;
        while(x > 0 || y > 0){
            count += ((x & 1) ^ (y & 1));
            x >>= 1;
            y >>= 1;
        }
        return count;
    }
}
