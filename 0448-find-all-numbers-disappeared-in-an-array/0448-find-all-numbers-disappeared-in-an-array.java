class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] f = new int[nums.length];
        List<Integer> res = new ArrayList<>();
        for(int num : nums){
            f[num-1]++;
        }
        for(int num=0;num < f.length;num++){
            if(f[num] == 0)
                res.add(num+1);
        }
        return res;
    }
}