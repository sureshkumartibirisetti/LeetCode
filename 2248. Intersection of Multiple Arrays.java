class Solution {
    public List<Integer> intersection(int[][] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        List<Integer> list=new ArrayList<>();
        for(int[] i:nums){
            for(int j:i){
                map.put(j,map.getOrDefault(j,0)+1);
            }
        }
        for(int i: map.keySet()){
            if(map.get(i)== nums.length){
                list.add(i);
            }
        }
        return list;
    }
}
