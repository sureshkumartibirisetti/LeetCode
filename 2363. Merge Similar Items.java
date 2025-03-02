class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int[] i:nums1){
            map.put(i[0],map.getOrDefault(i[0],0)+i[1]);
        }
        for(int[] i:nums2){
            map.put(i[0],map.getOrDefault(i[0],0)+i[1]);
        }
        List<List<Integer>> list=new ArrayList<>();
        int j=0;
        for(int i:map.keySet()){
            List<Integer> s = new ArrayList<>();
            s.add(i);
            s.add(map.get(i));
            list.add(s);

        }
        return list;
    }
}
