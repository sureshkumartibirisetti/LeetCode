class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int f = nums[0], s = nums[0], fc = 0, sc = 0, mc = 0;
        boolean sf = false;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] == f) fc++;
            if(nums[i] - f == 1) {
                sc++;
                sf = true;
                s = nums[i];
            } else if(nums[i] - f > 1){
                if(sf && mc < fc+sc){
                    mc = fc+sc;
                }
                if(sf && nums[i] - s == 1){
                    fc = sc;
                    sc = 1;
                    f = s;
                    s=nums[i];
                } else {
                    fc = 1;
                    sc = 0;
                    f = nums[i];
                    sf = false;
                }
            }
        }
        if(sf && mc < fc+sc){
            mc = fc+sc;
        }
        return mc;
    }
}