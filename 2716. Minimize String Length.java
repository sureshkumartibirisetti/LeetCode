class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> hash=new HashSet<>();
        for(int i=0;i<s.length();i++){
            hash.add(s.charAt(i));
        }
        return hash.size();
    }
}
