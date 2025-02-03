class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashMap<Integer,Integer> hm1=new HashMap<>();
        int j=0;
        for(int i:nums1){
            hm.put(i,j);
            j++;
        }
        j=0;
        for(int i:nums2){
            hm1.put(i,j);
            j++;
        }
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> al1=new ArrayList<>();
        List<Integer> al2=new ArrayList<>();
        for(int i: hm.keySet()){
            if(hm1.containsKey(i)){
                continue;
            }else{
                al1.add(i);
            }
        }
        for(int i: hm1.keySet()){
            if(hm.containsKey(i)){
                continue;
            }else{
                al2.add(i);
            }
        }
        res.add(al1);
        res.add(al2);
        return res;
    }
}
