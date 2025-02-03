class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        int res=hm.get(s.charAt(0));
        for(char s1:hm.keySet()){
            int c=hm.get(s1);
            if(c!=res){
                return false;
            }
        }
        return true;
    }
}
