class Solution {
    public int countTestedDevices(int[] nums) {
        int res=0;
        for(int i:nums){
            if(i>res){
                res++;
            }
        }
        return res;
    }
}
