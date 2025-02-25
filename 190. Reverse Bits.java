public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int r = 0;
        for (int i = 0;i<32;i++) {
            int b = n & 1;   
            r = (r << 1) | b; 
            n = n >>> 1;     
        }
        return r;   
    }
}
