class Solution {
    public int subarraySum(int[] nums, int k) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    res++;
                }
            }
        }
        return res;
    }
}
