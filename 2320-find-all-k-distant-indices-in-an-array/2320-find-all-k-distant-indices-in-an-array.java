class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
       ArrayList<Integer> list=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                list.add(i);
            }
        }
        for(int i=0;i< nums.length;i++){
            for(int j:list){
                if(Math.abs(i-j)<=k){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}