class Solution {
    public int countPrefixes(String[] words, String s) {
        int res=0;
        for(String i:words){
            if(s.startsWith(i)){
                res++;
            }
        }
        return res;
        
    }
}
