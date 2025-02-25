class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        for(int i=1;i<s.length();i+=2){
            if(s.charAt(i)=='0' && s.charAt(i-1)=='1'){
                continue;
            }else {
                return false;
            }
        }
        if(s.length()%2!=0){
            if(s.charAt(s.length()-1)!='1'){
                return false;
            }
        }
        return true;
    }
}
