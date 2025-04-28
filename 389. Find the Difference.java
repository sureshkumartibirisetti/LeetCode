class Solution {
    public char findTheDifference(String s, String t) {
        int a=0;
        int b=0;
        int i;
        for(i=0;i<s.length();i++){
            a+=s.charAt(i);
            b+=t.charAt(i);
        }
        b+=t.charAt(i);
        return ((char)(b-a));
    }
}
