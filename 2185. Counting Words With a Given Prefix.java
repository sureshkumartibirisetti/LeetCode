class Solution {
    public int prefixCount(String[] words, String pref) {
        int res=0;
        for(String i:words){
            if(i.startsWith(pref)){
                res++;
            }
        }
        return res;
    }
}
