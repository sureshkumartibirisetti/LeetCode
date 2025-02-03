class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        int a=0;
        int b=0;
        int l=word1.length();
        int r=word2.length();
        while(a!=l || b!=r){
            if(a<l){
                res+=word1.charAt(a);
                a++;
            }if(b<r){
                res+=word2.charAt(b);
                b++;
            }
        }
        return res;
    }
}
