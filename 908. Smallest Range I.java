class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(min>i){
                min=i;
            }if(max<i){
                max=i;
            }
        }
        return (max - k) - (min + k) < 0 ? 0 : (max - k) - (min + k);
    }
}
