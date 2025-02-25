class Solution {
    public int hammingDistance(int x, int y) {
        String s1 = Integer.toBinaryString(x);
        String s2 = Integer.toBinaryString(y);
        if(s1.length()<s2.length()){
            while(s1.length()!=s2.length()){
                s1="0"+s1;
            }
        }else{
            while(s1.length()!=s2.length()){
                s2="0"+s2;
            }
        }
        int res=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                res++;
            }
        }
        return res;
    }
}
