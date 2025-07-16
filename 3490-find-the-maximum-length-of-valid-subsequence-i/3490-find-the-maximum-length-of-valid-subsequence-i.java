class Solution {
    public int maximumLength(int[] nums) {
         int res=0;
        int res2=0;
        int res3=0;
        int res4=0;
        int t=0;
        int t1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && t==0){
                res++;
                t++;
            } else if(nums[i]%2!=0 && t==1) {
                res++;
                t--;
            }
            if(nums[i]%2!=0 && t1==0){
                res2++;
                t1++;
            } else if(nums[i]%2==0 && t1==1) {
                res2++;
                t1--;
            }
            if(nums[i]%2==0){
                res3++;
            }
            if(nums[i]%2!=0){
                res4++;
            }
        }
        int Ores1=Math.max(res3,res4);
        int Ores=Math.max(res,res2);
        return (Math.max(Ores,Ores1));
    }
}