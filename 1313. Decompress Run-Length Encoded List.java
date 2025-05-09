class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            arrSize+=nums[i];

        }
        int[] res=new int[arrSize];
        int a=0;
        for(int i=0;i<nums.length;i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                res[a]=nums[i+1];
                a++;
            }
        }

       return res;
    }
}
