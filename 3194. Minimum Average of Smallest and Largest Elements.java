class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double res=Integer.MAX_VALUE;
        int l=0;
        int h=nums.length-1;
        while(l<h){
            double a=(double) (nums[l]+nums[h])/2;
            if(res>a){
                res=a;
            }
            l++;
            h--;
        }
        return res;

        
    }
}
