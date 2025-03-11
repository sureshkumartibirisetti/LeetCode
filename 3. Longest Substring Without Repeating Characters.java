class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            String ss="";
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                ss+=s.charAt(j);
                set.add(s.charAt(j));
                if(ss.length()!=set.size()){
                    break;
                }
            }
            if(max<set.size()){
                max=set.size();
            }
            
        }
        return max;
    }
}
