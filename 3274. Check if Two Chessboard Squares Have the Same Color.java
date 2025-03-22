class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        int a=c1.charAt(0)+Integer.parseInt(c1.charAt(1)+"");
        int b=c2.charAt(0)+Integer.parseInt(c2.charAt(1)+"");
        if(a%2==0 && b%2==0){
            return true;
        }else if(a%2!=0 && b%2!=0){
            return true;
        }
        return false;
        
    }
}
