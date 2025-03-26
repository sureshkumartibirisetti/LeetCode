class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int res=0;
        for(int i=1;i<nums.length;i++){
            int a=Math.abs(nums[i]-nums[i-1]);
            if(res<a){
                res=a;

            }
        }
        int b=Math.abs(nums[0]-nums[nums.length-1]);
        if(b>res){
            res=b;
        }
        return (res);
    }
}
