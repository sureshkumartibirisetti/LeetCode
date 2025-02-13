class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i: hm.values()){
            hs.add(i);
        }
        if(hs.size()== hm.size()){
            return true;
        }
        return false;
    }
}
