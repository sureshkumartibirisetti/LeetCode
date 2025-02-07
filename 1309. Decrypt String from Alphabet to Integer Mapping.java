class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1;i>= 0;i--){
            int num;
            if(s.charAt(i) == '#'){
                num = (s.charAt(i-2)-'0')*10 + (s.charAt(i-1) - '0');
                i -= 2;
            }
            else{
                num = s.charAt(i)-'0';
            }
            sb.append((char) (num + 96));
        }
        return sb.reverse().toString();
    }
}
