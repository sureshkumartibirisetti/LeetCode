class Solution {
    public int minOperations(int[] nums) {
        int res=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                continue;
            }
            else{
                int temp=nums[i];
                nums[i]=nums[i-1]+1;
                res+=nums[i]-temp;
            }
        }
        return res; 
    }
}
