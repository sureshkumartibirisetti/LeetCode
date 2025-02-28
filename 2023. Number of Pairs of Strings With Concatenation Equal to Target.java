class Solution {
    public int numOfPairs(String[] nums, String target) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                String s=nums[i]+nums[j];
                if(s.equals(target) && i!=j){
                    res++;
                }
            }
        }
        return res;
    }
}
