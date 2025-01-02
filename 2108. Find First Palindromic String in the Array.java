class Solution {
    public String firstPalindrome(String[] arr) {
        for(String i:arr){
            if(isPalindrome(i)){
                return i;
            }
        }
        return "";
    }
    public static boolean isPalindrome(String i){
        int l=0;
        int h=i.length()-1;
        while(l<h){
            if(i.charAt(l)!=i.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
    
}
