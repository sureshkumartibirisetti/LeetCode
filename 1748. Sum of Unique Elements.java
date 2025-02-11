class Solution {
    public int sumOfUnique(int[] nums) {
        int res=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i: hm.keySet()){
            int s=hm.get(i);
            if(s==1){
                res+=i;
            }
        }
        return res;
    }
}
