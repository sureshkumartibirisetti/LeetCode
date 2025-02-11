class Solution {
    public long maximumTripletValue(int[] nums) {
        long res=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i]-nums[j]>0){
                    for(int k=j+1;k<nums.length;k++){
                        long s=(long)(nums[i]-nums[j])*nums[k];
                        if(s>res){
                            res=s;
                        }
                    }
                }
            }
        }
        return res;
    }
}
