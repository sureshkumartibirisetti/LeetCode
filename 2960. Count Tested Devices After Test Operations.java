class Solution {
    public int countTestedDevices(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res++;
                for(int j=i+1;j< nums.length;j++){
                    nums[j]=nums[j]-1;
                }
            }
        }
        return res;
    }
}
