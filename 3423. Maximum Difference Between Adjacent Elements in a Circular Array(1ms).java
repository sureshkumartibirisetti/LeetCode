class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int res=Math.abs(nums[0]-nums[nums.length-1]);
        for(int i=1;i<nums.length;i++){
            int a=Math.abs(nums[i]-nums[i-1]);
            res=Math.max(res,a);
        }
        return res;
    }
}
