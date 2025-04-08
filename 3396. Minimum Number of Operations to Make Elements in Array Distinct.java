class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[101];
        for(int i = n - 1 ; i >= 0 ; i--){
            if(seen[nums[i]])
                return i / 3 + 1;
            else seen[nums[i]] = true;
        }
        return 0;
    }
}
