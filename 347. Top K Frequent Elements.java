class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int i=0;
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            if(i>=k){
                break;
            }
            res[i]= entry.getKey();
            i++;
        }

        return res;
    }
}
