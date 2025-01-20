class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer,Integer> hM=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(hM.containsKey(a)){
                res[1]=i;
                res[0]=hM.get(a);
                return res;
            }else{
                hM.put(nums[i],i);
            }

        }
        return new int[0];
    }
}
