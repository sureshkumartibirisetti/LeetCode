class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //-4,-1,-1,0,1,2
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i< nums.length && nums[i]<=0;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                twoSum2(nums,i,list);
            }
        }
        return list;
    }
    public static void twoSum2(int[] nums,int i,List<List<Integer>> res){
        int l=i+1;
        int r=nums.length-1;
        while(l<r){
            int sum=nums[i]+nums[l]+nums[r];
            if(sum<0){
                l++;
            }else if(sum>0){
                r--;
            }else{
                res.add(Arrays.asList(nums[i],nums[l++],nums[r--]));
                while(l<r && nums[l]==nums[l-1]){
                    ++l;
                }
            }
        }
    }
}