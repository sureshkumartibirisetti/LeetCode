class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int res=0;
        for(int i:nums1){
            for(int j:nums2){
                if(i%(j*k)==0){
                    res+=1;
                }
            }
        }
        return res;
    }
}
