class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int c=0;
        for(int i:nums){
            if(i%2==0){
                c++;
            }
        }
        return (c>=2);
    }
}
