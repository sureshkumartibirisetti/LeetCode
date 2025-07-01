class Solution {
    public boolean detectCapitalUse(String word) {
        String a=(word.charAt(0)+"").toUpperCase();
        String b=word.substring(1,word.length()).toLowerCase();
        String s=a+b;
        if(word.equals(word.toUpperCase())){
            return true;
        } else if(word.equals(word.toLowerCase())) {
            return true;
        }
        else if(word.equals(s)){
            return true;
        }
        
        
        return false;
        
    }
}