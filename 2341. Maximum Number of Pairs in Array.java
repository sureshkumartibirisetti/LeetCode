class Solution {
    public int[] numberOfPairs(int[] nums) {
        int p=0;
        int r=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i: map.values()){
            p+=(i/2);
            r+=(i%2);
        }
        return (new int[]{p,r});
        
    }
}
