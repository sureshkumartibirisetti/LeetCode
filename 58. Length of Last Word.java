class Solution {
    public int lengthOfLastWord(String s) {
        String s1=s.trim();
        int c=0;
        for(int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i)==' '){
                break;
            }else{
                c++;
            }
        }
        return c;
    }
}
