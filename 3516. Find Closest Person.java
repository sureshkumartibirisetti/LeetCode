class Solution {
    public int findClosest(int x, int y, int z) {
       int x1=Math.abs(x-z);
        int x2=Math.abs(y-z);
        return ((x1==x2)?0:(x1>x2)?2:1); 
    }
}
