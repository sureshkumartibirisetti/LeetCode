class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int max=0;
        while(i<j){
            if(nums[i]+nums[j]>max){
                max=nums[i]+nums[j];
            }
            i++;
            j--;
        }
        return max;
    }
}
