class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(i-k>=0 && i+k<nums.length){
                if(nums[i]>nums[i-k] && nums[i]>nums[i+k]){
                    res+=nums[i];
                }
            }else if(i-k<0){
                if(nums[i]>nums[i+k]){
                    res+=nums[i];
                }
            }else{
                if(nums[i]>nums[i-k]){
                    res+=nums[i];
                }
            }
        }
        return res;
    }
}
