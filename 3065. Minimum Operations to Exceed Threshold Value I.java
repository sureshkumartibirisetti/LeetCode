class Solution {
    public int minOperations(int[] nums, int k) {
        int i=0;
        for(int j:nums){
            if(j<k){
                i++;
            }
        }
        return i;
    }
}
