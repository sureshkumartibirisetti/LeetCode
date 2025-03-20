class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i=0,j=nums.length-1;
        long res=0;
        while(i<j){
            res+=Integer.parseInt(Integer.toString(nums[i])+Integer.toString(nums[j]));
            i++;
            j--;
        }
        if(nums.length%2!=0){
            res+=nums[i];
        }
        return res;
    }
}
