class Solution {
    public String reverseOnlyLetters(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z')||(ch<='Z' && ch>='A')){
                res+=ch;
            }
        }
        int res_len=res.length()-1;
        String finalres="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z')||(ch<='Z' && ch>='A')){
                finalres+=res.charAt(res_len);
                res_len--;
            }else{
                finalres+=ch;
            }
        }
        return finalres;

    }
}
