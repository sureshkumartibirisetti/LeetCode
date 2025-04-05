class Solution {
    public int subsetXORSum(int[] nums) {
        int res=0;
        for(int i=0;i<Math.pow(2,nums.length);i++){
            String s = String.format("%" + nums.length + "s", Integer.toBinaryString(i)).replace(' ', '0');
            int temp=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    temp=temp^nums[j];
                }
            }
            res+=temp;

        }
        return res;
    }
}
