class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int res=0;
        for(int i=left;i<=right;i++){
            String s="aeiou";
            String ss=words[i];
            if(s.contains(ss.charAt(0)+"") && s.contains(ss.charAt((ss.length()-1))+"")){
                res++;
            }
        }
        return res;
    }
}
