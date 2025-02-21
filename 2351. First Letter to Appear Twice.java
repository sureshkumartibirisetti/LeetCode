class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==2){
                return i;
                
            }
        }
        return 's';
        
    }
}
