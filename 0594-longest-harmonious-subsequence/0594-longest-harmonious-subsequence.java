class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Arrays.sort(nums);
        int res=0;
        int l=0;
        int r=0;
        while(r!=nums.length){
            if(nums[l]==nums[r]){
                r++;
            } else if (nums[r]-nums[l]!=1) {
                l=r;
                r=l+1;
            }else{
                int a=map.get(nums[l]);
                int b=map.get(nums[r]);
                if(res<(a+b)){
                    res=a+b;
                }
                l=r;
                r=l+1;
            }
        }
        return res;
    }
}