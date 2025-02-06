class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int a1=0;
        for(int j: hm.keySet()){
            int a=hm.get(j);
            if(a>1){
                a1^=j;
            }
        }
        return a1;
        
        
    }
}
