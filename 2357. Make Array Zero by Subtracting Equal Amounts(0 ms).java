class Solution {
    public int minimumOperations(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       for(int i:nums){
        if(i!=0){
            set.add(i);
        }
       }
       return set.size();
    }
}
