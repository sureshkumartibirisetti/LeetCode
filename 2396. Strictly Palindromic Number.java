class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            String s=baseConversion(Integer.toString(n),10,i);
            if(!isPalin(s)){
                return false;
            }
        }
        return true;
    }
    public static String baseConversion(String number, int sBase, int dBase)
    {
        return Integer.toString(
                Integer.parseInt(number, sBase), dBase);
    }
    public static boolean isPalin(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
