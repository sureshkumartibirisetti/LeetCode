class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0,a=word1.length(),b=word2.length();
        while(i<a || j<b){
            if(i<a){
                sb.append(word1.charAt(i++));
            }
            if(j<b){
                sb.append(word2.charAt(j++));
            }
        }
        return sb.toString();
    }
}