class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
         int[] postfix=new int[nums.length];
         int prefixP=1;
         int postfixP=1;
         for(int i=0;i<nums.length;i++){
             prefixP*=nums[i];
             prefix[i]=prefixP;
         }
         for(int i=nums.length-1;i>=0;i--){
             postfixP*=nums[i];
             postfix[i]=postfixP;
         }
        for(int i=0;i< nums.length;i++){
            if(i==0){
                nums[i]=postfix[i+1];
            }
            else if(i==nums.length-1){
                nums[i]=prefix[i-1];
            }else{
                nums[i]=prefix[i-1]*postfix[i+1];
            }
        }
        return nums;
    }
}
