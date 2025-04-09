class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(i>k){
                set.add(i);
            }else if(k>i){
                return -1;
            }
        }
        return set.size();   
    }
}
