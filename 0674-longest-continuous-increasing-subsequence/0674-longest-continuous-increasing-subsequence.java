class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res=1;
        int temp=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                temp++;
                res=Math.max(res,temp);
            }else{
               temp=1;
            }
        }
        return res;
    }
}