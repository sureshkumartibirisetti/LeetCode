class Solution {
    public int countGoodSubstrings(String s) {
        int res=0;
        for(int i=0;i<s.length()-2;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<i+3;j++){
                set.add(s.charAt(j));
            }
            if(set.size()==3){
                res++;
            }
        }
        return res;
    }
}
