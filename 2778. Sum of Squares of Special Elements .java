class Solution {
    public int sumOfSquares(int[] nums) {
        int l=nums.length;
        int res=0;
        for(int i=1;i<=l;i++){
            if(l%i==0){
                res=res+(nums[i-1]*nums[i-1]);
            }
        }
        return res;
    }
}
