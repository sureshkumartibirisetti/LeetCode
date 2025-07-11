class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int[] res=new int[nums.length];
        for(int x=0;x<nums.length;x++){
            if(nums[x]%2==0){
                res[i]=nums[x];
                i++;
            }else{
                res[j]=nums[x];
                j--;
            }
        }
        return res;
    }
}