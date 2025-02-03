class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int min=nums[0];
            int min_Index=0;
            for(int j=1;j< nums.length;j++){
                if(nums[j]<min){
                    min=nums[j];
                    min_Index=j;
                }
            }
            nums[min_Index]=nums[min_Index]*multiplier;
        }
        return nums;
    }
}
