class Solution {
    public int countPrefixSuffixPairs(String[] nums) {
        int res=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j].startsWith(nums[i]) && nums[j].endsWith(nums[i])){
                    res++;
                }
            }
        }
        return res;
        
    }
}
