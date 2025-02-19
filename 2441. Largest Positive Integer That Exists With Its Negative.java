class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]==-nums[j]){
                return nums[j];
            }else if(nums[j]>-nums[i]){
                j--;
            }else if(nums[j]<-nums[i]){
                i++;
            }
        }
        return -1;
    }
}
