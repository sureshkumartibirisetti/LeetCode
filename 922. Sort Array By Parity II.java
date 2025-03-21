class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res=new int[nums.length];
        int i=0;
        int j=1;
        for(int a=0;a<nums.length;a++){
            if(nums[a]%2==0){
                res[i]=nums[a];
                i+=2;
            }else{
                res[j]=nums[a];
                j+=2;
            }
        }
        return res;
    }
}
