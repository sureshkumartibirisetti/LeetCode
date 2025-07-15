class Solution {
    public boolean isValid(String word) {
        int c=0;
        int con=0;
        int vow=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='0' && ch<='9'){
                c++;
                continue;
            }
            if("@#$".contains(ch+"")){
                return false;
            }if("aeiouAEIOU".contains(ch+"")){
                vow++;
                c++;
            }else{
                con++;
                c++;
            }
        }
        if(con>=1 && vow>=1 && c>=3) return true;
        return false;
    }
}