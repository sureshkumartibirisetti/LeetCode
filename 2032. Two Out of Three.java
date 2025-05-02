class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
       ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set3=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }
        for(int i:nums3){
            set3.add(i);
        }
        for(int i:set1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:set2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:set3){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>=2){
                res.add(i);
            }
        }
        return res;
    }
}
