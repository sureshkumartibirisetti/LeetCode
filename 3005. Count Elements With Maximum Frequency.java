class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max=0;
        for(int i:hm.values()){
            if(i>max){
                max=i;
            }
        }
        int res=0;
        for(int i: hm.values()){
            if(i==max){
                res+=max;
            }
        }
        return res;
    }
}
