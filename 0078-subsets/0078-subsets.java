class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=(int)Math.pow(2,nums.length);
        for(int i=0;i< n;i++){
            String s = String.format("%"+nums.length+"s", Integer.toBinaryString(i)).replace(' ', '0');
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)!='0'){
                    list.add(nums[j]);
                }
            }
            res.add(list);
        }
        return res;
    }
}