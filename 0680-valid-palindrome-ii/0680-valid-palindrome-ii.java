class Solution {
    public boolean validPalindrome(String s) {
        int l=s.length();
        int res=0;
        if(l==0||l==1||l==2){
            return true;
        }else{
            int i=0;
            int j=l-1;
            while(i<j){
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
                    continue;
                }else{
                    boolean s1=ispalindrome(s,i+1,j);
                    boolean s2=ispalindrome(s,i,j-1);
                    boolean s3=s1||s2;
                    return s3;
                }
            }
        }
        return true;

    }
    static boolean ispalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
                continue;
            }else return false;
        }
        return true;
    }
    
}