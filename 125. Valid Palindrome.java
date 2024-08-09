class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        String temp=s;
        String n="";
        for(int i=s.length()-1;i>=0;i--){
            n+=s.charAt(i);
        }
        if(temp.equals(n)){
            return true;
        }else{
            return false;
        }
        }
}
