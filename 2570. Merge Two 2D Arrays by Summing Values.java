class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int[] i:nums1){
            map.put(i[0],map.getOrDefault(i[0],0)+i[1]);
        }
        for(int[] i:nums2){
            map.put(i[0],map.getOrDefault(i[0],0)+i[1]);
        }
        int[][] res=new int[map.size()][];
        int j=0;
        for(int i:map.keySet()){
            res[j]=new int[]{i,map.get(i)};
            j++;
        }
        return res;
    }
}
