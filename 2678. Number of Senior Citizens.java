class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String s1:details){
            if (((s1.charAt(11) - '0') * 10 + (s1.charAt(12) - '0')) > 60)
                c++;
        }
        return c;
    }
}
