class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int a=0;
        int b=1;
        for(int i:nums){
            if(i>0){
                res[a]=i;
                a+=2;
            }else{
                res[b]=i;
                b+=2;
            }
        }
        return res;
    }
}

