class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        int a=0;
        for(int i=0;i<nums1.length;i++){
            int s=-1;
            boolean s1=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    s1=true;
                }
                if(s1){
                    if(nums1[i]<nums2[j]){
                        res[a]=nums2[j];
                        a++;
                        s=nums2[j];
                        break;
                    }
                }
            }
            if(s==-1){
                res[a]=s;
                a++;
            }
        }
        return res;
    }
}
