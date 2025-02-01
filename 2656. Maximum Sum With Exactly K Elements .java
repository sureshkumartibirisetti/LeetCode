class Solution {
    public int maximizeSum(int[] nums, int k) {
        int s= Integer.MIN_VALUE;
        for(int i:nums){
            if(s<i){
                s=i;
            }
        }
        int sum=0;
        for(int i=s;i<s+k;i++){
            sum=sum+i;
        }
        return sum;
    }
}
