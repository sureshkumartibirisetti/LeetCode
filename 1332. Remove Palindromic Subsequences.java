class Solution {
    public int removePalindromeSub(String s) {
        if(isPalin(s)){
            return 1;
        }
        return 2;
    }
    static boolean isPalin(String s){
        int l=0;
        int h=s.length()-1;
        while(l<h){
            if(s.charAt(l)!=s.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    } 
}
