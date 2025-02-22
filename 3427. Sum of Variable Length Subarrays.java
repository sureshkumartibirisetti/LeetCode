class Solution {
    public int subarraySum(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int temp=Math.max(0,i-nums[i]);
            for(int j=temp;j<=i;j++){
                res+=nums[j];
            }
        }
        return res;
    }
}
