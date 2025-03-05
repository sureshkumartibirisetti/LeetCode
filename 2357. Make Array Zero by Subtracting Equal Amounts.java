class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                for(int j=i;j<nums.length;j++){
                    nums[j]=nums[j]-temp;
                }
                res++;
            }
        }
        return res;
    }
}
