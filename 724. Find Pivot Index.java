class Solution {
    public int pivotIndex(int[] nums) {
        int res=-1;
        for(int i=nums.length-1;i>=0;i--){
            int left_sum=0;
            int right_sum=0;
            for(int a=0;a<i;a++){
                left_sum+=nums[a];
            }
            for(int b=i+1;b<nums.length;b++){
                right_sum+=nums[b];
            }
            if(left_sum==right_sum){
                res=i;
            }
        }
        return res;
    }
}
