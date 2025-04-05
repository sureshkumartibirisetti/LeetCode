class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=0;
        for(int i:map.keySet()){
            if(map.get(i)>=2){
                res=i;
                break;
            }
        }
        return res;
    }
}
