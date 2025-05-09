class Solution {
    public int smallestNumber(int n) {
        int res=0;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            res+=Math.pow(2,i);
        }
        return res;
    }
}
