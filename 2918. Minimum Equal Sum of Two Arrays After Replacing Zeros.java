class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long s1=0,s2=0,z1=0,z2=0;
        for(int i:nums1){
            if(i==0){
                z1+=1;
            }
            else{
                s1+=i;
            }
        }
        for(int i:nums2){
            if(i==0){
                z2+=1;
            }
            else{
                s2+=i;
            }
        }
        long c_s1=s1+z1;
        long c_s2=s2+z2;
        if((z1==0)&&(s1<c_s2)){
            return (-1);
        }
        if((z2==0)&&(s2<c_s1)){
            return (-1);
        }
        return (Math.max(c_s1,c_s2));
    }
}
