class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int res=-1;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(res<(j-i-1)){
                        res=j-i-1;
                    }
                }
            }
        }
        return res;
    }
}
