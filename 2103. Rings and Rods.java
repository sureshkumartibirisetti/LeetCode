class Solution {
    public int countPoints(String rings) {
        int count=0;
        HashMap<Character, Set<Character>> hm=new HashMap<>();
        for(int i=0;i<rings.length();i+=2){
            char color = rings.charAt(i);
            char rod = rings.charAt(i + 1);

            hm.putIfAbsent(rod, new HashSet<>());
            hm.get(rod).add(color);
        }
        for(Set<Character> i:hm.values()){
            if(i.size()==3){
                count++;
            }

        }
        return count;
    }
}
