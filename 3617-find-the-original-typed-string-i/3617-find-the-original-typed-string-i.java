class Solution {
    public int possibleStringCount(String word) {
        int l=0;
        int r=1;
        int res=0;
        while(r!=word.length()){
            if(word.charAt(l)!=word.charAt(r)){
                l=r;
                r=l+1;
            }
            else{
                res++;
                r++;
            }
        }
        return res+1;
    }
}