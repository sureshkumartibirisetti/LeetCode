class Solution {
    public String reversePrefix(String a, int k) {
        String s1="";
        for (int i=k-1;i>=0;i--){
            s1+=a.charAt(i);
        }
        s1+=a.substring(k,a.length());
        return s1;
    }
}