class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] temp=new int[nums.length];
        Set<Integer> set=new HashSet<>();
        for(int i=0;i< nums.length;i++) {
            set.add(nums[i]);
            temp[i]= set.size();
        }
        set.clear();
        for(int i= nums.length-1;i>=0;i--){
            temp[i]-=set.size();
            set.add(nums[i]);
        }
        return temp;
    }
}
