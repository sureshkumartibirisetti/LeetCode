class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        Arrays.sort(nums);
        int temp=0;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                  temp++;
                  if(temp>res){
                      res=temp;
                  }
            } else if (nums[i]==nums[i+1]) {
                continue;
            } else{
                temp=0;
            }

        }
        return res+1;
    }
}
