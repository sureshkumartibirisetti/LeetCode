class Solution {

    int sum(int index,int[] nums,int val){
        if(index==nums.length){
            return val;
        }
        int ans=0;
        ans+=sum(index+1,nums,val);
        ans+=sum(index+1,nums,val^nums[index]);
        return ans;
    }

    public int subsetXORSum(int[] nums) {
        return sum(0,nums,0);
    }
}