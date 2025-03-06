class Solution {
    public String greatestLetter(String s) {
       for(char i='z';i>='a';i--){
            if(s.contains(i+"")&&s.contains(((char)(i-32))+"")){
                return ((char)(i-32))+"";
            }
        }
        return "";
    }
}
