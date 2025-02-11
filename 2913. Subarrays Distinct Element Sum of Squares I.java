class Solution {
    public int sumCounts(List<Integer> nums) {
        int res=0;
        for(int i=0;i<nums.size();i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<nums.size();j++){
                hs.add(nums.get(j));
                res+=hs.size()*hs.size();
            }
        }
        return res;
    }
}
