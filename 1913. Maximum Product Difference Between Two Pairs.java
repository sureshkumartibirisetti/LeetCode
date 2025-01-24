class Solution {
    public int maxProductDifference(int[] nums) {
        int max1=nums[0];
        int max2=-1;
        int min1=nums[0];
        int min2=Integer.MAX_VALUE;
        for(int i=1;i< nums.length;i++){
            if(max1<=nums[i]){
                max2=max1;
                max1=nums[i];
            }else{
                if(nums[i]>max2){
                    max2=nums[i];
                }
            }
            if(min1>=nums[i]){
                min2=min1;
                min1=nums[i];
            }else{
                if(nums[i]<min2){
                    min2=nums[i];
                }
            }
        }
        return ((max1*max2)-(min2*min1));
    }
}
