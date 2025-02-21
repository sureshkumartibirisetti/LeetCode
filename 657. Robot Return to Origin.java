class Solution {
    public boolean judgeCircle(String s) {
        int u=0;
        int l=0;
        int d=0;
        int r=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U'){
                u++;
            }else if(s.charAt(i)=='D'){
                d++;
            }else if(s.charAt(i)=='L'){
                l++;
            }else{
                r++;
            }
        }
        return (u==d && l==r);
        
    }
}
