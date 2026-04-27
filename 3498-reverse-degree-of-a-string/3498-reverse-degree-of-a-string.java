class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=1;i<=s.length();i++){
              int x=s.charAt(i-1)-96;
              int y=27-x;
              res+=(y*i);
        }
        return res;
    }
}