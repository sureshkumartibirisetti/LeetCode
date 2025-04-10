class Solution {
    public int findMiddleIndex(int[] nums) {
         int leftsum=0,rightSum=0;
        for(int i=0;i<nums.length;i++){
            rightSum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            if(rightSum==leftsum) return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}
