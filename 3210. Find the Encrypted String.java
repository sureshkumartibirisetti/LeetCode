class Solution {
    public String getEncryptedString(String s, int k) {
        String res="";
        for(int i=0;i<s.length();i++){
            int temp=i+k;
            while(temp>=s.length()) {
                temp=temp-s.length();
            }
            res+=s.charAt(temp);
        }
        return res;
    }
}
